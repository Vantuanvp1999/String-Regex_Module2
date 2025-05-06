import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DanTriNewsExtractor {
    public static void main(String[] args) {
        try{
            String url = new String("https://dantri.com.vn/the-gioi.htm");
            URL url1 = new URL(url);
            InputStream inputStream = url1.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder htmlString = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                htmlString.append(line);
            }
            reader.close();
            String html = htmlString.toString();
            Pattern pattern = Pattern.compile(
                    "<h3 class=\"article-title\">\\s*<a[^>]*href=\"([^\"]+)\"[^>]*>(.*?)</a>",
                    Pattern.CASE_INSENSITIVE | Pattern.DOTALL
            );
            Matcher matcher = pattern.matcher(html);
            System.out.println(":newspaper: Danh sách bản tin từ Dân Trí (thế giới):");
            int count = 0;
            while (matcher.find()) {
                count++;
                String link = "https://dantri.com.vn" + matcher.group(1).trim();
                String title = matcher.group(2).replaceAll("<[^>]+>", "").trim(); // xóa thẻ HTML phụ nếu có
                System.out.println(count + ". " + title);
                System.out.println("   :link: " + link);
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}