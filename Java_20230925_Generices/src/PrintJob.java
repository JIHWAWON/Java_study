import java.util.Scanner;

public class PrintJob {

    public static int computePrintJobCost(String colorType, String paperSize, int count) {
        String[][] color = new String[2][2];
        String[][] paper = new String[4][2];

        colorInfo(color);
        paperInfo(paper);

        Scanner s = new Scanner(System.in);
        System.out.println("Enter colortype papersize and count: ");
        String input = s.nextLine();
        String input2 = s.nextLine();
        count = s.nextInt();

        int cost = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                if (input.equalsIgnoreCase(color[i][0]) && input2.equalsIgnoreCase(paper[j][0])) {
                    int colorCost = Integer.parseInt(color[i][1]);
                    int paperCost = Integer.parseInt(paper[j][1]);
                    cost = colorCost * paperCost * count;
                }
            }
        }

        return cost;
    }

    public static void colorInfo(String[][] color) {
        color[0][0] = "Grayscale";
        color[0][1] = "5";
        color[1][0] = "Color";
        color[1][1] = "15";
    }

    public static void paperInfo(String[][] paper) {
        paper[0][0] = "A4";
        paper[0][1] = "40";
        paper[1][0] = "A5";
        paper[1][1] = "20";
        paper[2][0] = "Letter";
        paper[2][1] = "30";
        paper[3][0] = "Legal";
        paper[3][1] = "20";
    }

    public static void main(String[] args) {
        int cost = computePrintJobCost("", "", 0);
        System.out.println("Print job cost: $" + cost);
    }
}
