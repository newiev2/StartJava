public class VariablesTheme {
    public static void main(String[] args) {
        //Создание переменных и вывод их значений на консоль
        
        System.out.println("Создание переменных и вывод их значений на консоль");
        byte cpuThreadsNumber = 4;
        short ram = 16;
        int screenWidth = 1920;
        long screenHeight = 1080;
        float cpuFrequency = 2.40f;
        double ssdVolume = 240.8;
        char systemDriveSign = 'C';
        boolean isForGaming = false;

        System.out.println("Количество ядер CPU: " + cpuThreadsNumber);
        System.out.println("ОЗУ: " + ram);
        System.out.println("Ширина экрана: " + screenWidth);
        System.out.println("Высота экрана: " + screenHeight);
        System.out.println("Частота процессора: " + cpuFrequency);
        System.out.println("Объем SSD: " + ssdVolume);
        System.out.println("Обозначение системного диска: " + systemDriveSign);
        System.out.println("Комьютер для гейминга: " + isForGaming);
    }
}