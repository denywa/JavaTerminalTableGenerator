import java.lang.reflect.Field;

public class TableGenerator {

    public static void printTable(Object[] objects) {
        if (objects == null || objects.length == 0) {
            System.out.println("Tidak ada data untuk ditampilkan.");
            return;
        }

        Class<?> clazz = objects[0].getClass();
        Field[] fields = clazz.getDeclaredFields();

        // Menentukan lebar kolom
        int[] columnWidths = new int[fields.length];
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            columnWidths[i] = fields[i].getName().length();
        }

        // Mengukur lebar kolom berdasarkan data
        for (Object obj : objects) {
            for (int i = 0; i < fields.length; i++) {
                try {
                    String value = String.valueOf(fields[i].get(obj));
                    columnWidths[i] = Math.max(columnWidths[i], value.length());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        // Mencetak header
        printLine(columnWidths);
        String[] headers = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            headers[i] = fields[i].getName();
        }
        printRow(headers, columnWidths);
        printLine(columnWidths);

        // Mencetak baris data
        for (Object obj : objects) {
            String[] row = new String[fields.length];
            for (int i = 0; i < fields.length; i++) {
                try {
                    row[i] = String.valueOf(fields[i].get(obj));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            printRow(row, columnWidths);
        }
        printLine(columnWidths);
    }

    private static void printLine(int[] columnWidths) {
        for (int width : columnWidths) {
            System.out.print("+");
            for (int i = 0; i < width; i++) {
                System.out.print("-");
            }
        }
        System.out.println("+");
    }

    private static void printRow(String[] row, int[] columnWidths) {
        for (int i = 0; i < row.length; i++) {
            System.out.print("|");
            System.out.print(padRight(row[i], columnWidths[i]));
        }
        System.out.println("|");
    }

    private static String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }
}
