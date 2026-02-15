class DownloadTask extends Thread {
    private String fileName;

    DownloadTask(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(fileName + " downloading... " + (i * 20) + "%");
                Thread.sleep(500);
            }
            System.out.println(fileName + " download completed.");
        } catch (Exception e) {
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Multi Thread Downloader developed by Monty");
        DownloadTask d1 = new DownloadTask("File1");
        DownloadTask d2 = new DownloadTask("File2");
        DownloadTask d3 = new DownloadTask("File3");

        d1.start();
        d2.start();
        d3.start();
    }
}
