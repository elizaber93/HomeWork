package HW4.dto;
import java.util.Scanner;

public class HanoiTower {

    public HanoiTower() {
        this.getRingNumber();
        this.initialState();
        this.stateOutput();
    }

    private int ringNumber;
    private char[][] columns;
    private boolean isExit = false;

    /***
     * Метод принимающий значение числа колец с клавиатуры и записывающий его в переменную
     * ringNumber
     */
    private void getRingNumber() {

        do {
            try {
                System.out.println("Введите количество колец, 3-8");
                Scanner scan = new Scanner(System.in);
                this.ringNumber = scan.nextInt();
            } catch(Exception e) {
                this.ringNumber = 0;
            }

            if (this.ringNumber <= 8 && this.ringNumber >= 3)
                return;
            System.out.println("Неверное значение.");
        } while (true);

    }

    /***
     * Метод создающий первоначальный двумерный массив с первым столбцом,
     * заполненным "кольцами" с размером от 1 до ringNumber
     */
    private void initialState() {
        this.columns = new char[ringNumber][3];
        for (int i = 0; i < this.columns.length; i++) {
            for (int j = 0; j < this.columns[i].length; j++) {
                if (j != 0)
                    this.columns[i][j] = '*';
                else
                    this.columns[i][j] = (char) (i + 49);
            }
        }
    }

    /***
     * Метод выполняющий вывод в консоль текущее состояние массива, представляющего из себя
     * стержни с кольцами
     */
    private void stateOutput() {
        for (char[] chars : this.columns) {
            System.out.printf("%c\t%c\t%c\n", chars[0], chars[1], chars[2]);
        }
    }

    /***
     * Метод, выполняющий перемещение кольца с одного стержня на другой
     * @param from - откуда перенести
     * @param here - куда перенести
     */
    private void makeMove(int from, int here) {

        char element = '*';
        for (int i = 0; i < ringNumber; i++) {
            if (!(this.columns[i][from - 1] == '*')) {
                element = columns[i][from - 1];
                columns[i][from - 1] = '*';
                break;
            }
        }

        for (int i = 0; i < ringNumber - 1; i++) {
            if (this.columns[i][here - 1] == '*' && this.columns[i + 1][here - 1] != '*') {
                if (element > this.columns[i + 1][here - 1]) {
                    System.out.println("Неверный ход!");
                    return;
                }
                columns[i][here - 1] = element;
                break;
            } else if (this.columns[ringNumber - 1][here - 1] == '*') {
                this.columns[ringNumber - 1][here - 1] = element;
                break;
            }
        }
        System.out.println("Enter - продолжить, q - выход  ");
        Scanner scan = new Scanner(System.in);
        String ex = scan.nextLine();
        if (ex.equals("q")) this.isExit = true;
    }

    /***
     * Метод проверяющий перенесены ли все кольца на другой стержень
     * в правильном порядке
     * @return  true, если совпадает
     *          false, если не совпадает
     */
    private boolean isFinish() {
        for (int j = 0; j < this.columns[0].length; j++) {
            if ((this.columns[j][1] != (char) (j + 49) &&
                    this.columns[j][2] == '*') ||
                    (this.columns[j][2] != (char) (j + 49) &&
                            this.columns[j][1] == '*')) return false;
        }
        return true;
    }

    /***
     * Метод выполняющий проверку, можно ли переносить кольцо
     * с заданного стержня на другой заданный стержень
     * @param from - откуда переносится
     * @param here - куда переносится
     * @return  true, если можно перенести
     *          false, если нельзя
     */
    private boolean checkMove(int from, int here) {
        boolean cFrom = false;

        for (char[] chars : this.columns) {
            if ((chars[from - 1] != '*')) {
                cFrom = true;
                break;
            }
        }
        char element = '*';
        for (int i = 0; i < ringNumber; i++) {
            if (!(this.columns[i][from - 1] == '*')) {
                element = columns[i][from - 1];
                break;
            }
        }
        for (int i = 0; i < this.columns.length - 1; i++) {
            if (this.columns[i][here - 1] == '*' && this.columns[i + 1][here - 1] != '*') {
                if (element < this.columns[i + 1][here - 1]) {
                    return cFrom;
                }
            }
        }
        int count = 0;
        for (char[] chars : this.columns) {
            if (chars[here - 1] == '*') count++;
        }
        if (count == this.columns.length) return cFrom;
        return false;
    }

    /***
     * Метод отвечающий за ручной режим игры
     */
    public void play() {

        do {

            int fromWhere;
            int here;

            do {
                try {
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Откуда перенести? Введите номер столбца");
                    fromWhere = scan.nextInt();
                    System.out.println("Куда перенести? Введите номер столбца");
                    here = scan.nextInt();
                } catch(Exception e) {
                    System.out.println("Введены неверные значения");
                    stateOutput();
                    continue;
                }

                if ((fromWhere > 0 && fromWhere <= this.ringNumber) &&
                        (here > 0 && here <= this.ringNumber))
                    break;
                else
                    System.out.println("Введены неверные значения");
            } while (true);

            if (!checkMove(fromWhere, here)) {
                System.out.println("Неверный ход!");
            } else
                this.makeMove(fromWhere, here);

            stateOutput();
            if (this.isExit) {
                System.out.println("Всего доброго!");
                return;
            }


        } while (!isFinish());

        System.out.println("БДЫЩ-БДЫЩ!! ПОБЕДА!!");
    }

    /***
     * Метод, отвечающий за автоматический режим игры
     */
    public void playAutomat () {

        if (this.isExit) return;
        do {
            if (this.ringNumber % 2 == 0) {
                if (!checkMove(1, 2)) {
                    this.makeMove(2, 1);
                    if (this.isExit) break;
                } else
                    this.makeMove(1, 2);
                if (this.isExit) return;
                stateOutput();
                if (isFinish()) break;

                if (!checkMove(1, 3)) {
                    this.makeMove(3, 1);
                } else
                    this.makeMove(1, 3);
                if (this.isExit) return;
                stateOutput();
                if (isFinish()) break;

            } else {
                if (!checkMove(1, 3)) {
                    this.makeMove(3, 1);
                } else
                    this.makeMove(1, 3);
                if (this.isExit) return;
                stateOutput();
                if (isFinish()) break;

                if (!checkMove(1, 2)) {
                    this.makeMove(2, 1);
                } else
                    this.makeMove(1, 2);
                if (this.isExit) return;
                stateOutput();
                if (isFinish()) break;
            }
            if (!checkMove(2, 3)) {
                this.makeMove(3, 2);
            } else
                this.makeMove(2, 3);
            if (this.isExit) break;
            stateOutput();
            if (isFinish()) break;
        } while (true);
        System.out.println("БДЫЩ-БДЫЩ!! ПОБЕДА!!");

    }

}

