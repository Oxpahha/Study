import java.io.*;

public class files {
    public static void main(String[] args) throws Exception{
        String path = "Geekbrains/7.Module Java/1th lecture/file.txt";

        // Create and write
        try (FileWriter fw = new FileWriter(path, false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        // Read by char
        try (FileReader fr = new FileReader(path)) {
            int c;
            while ((c = fr.read()) != -1) {
                char ch = (char) c;
                if (ch == '\n') {
                    System.out.print(ch);
                } else {
                    System.out.print(ch);
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("\n");

        // Read by lines
        BufferedReader br = new BufferedReader(new FileReader(path));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();

    }
}
