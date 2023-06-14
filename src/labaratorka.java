
import java.util.Arrays;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Student
 */
public class labaratorka extends javax.swing.JFrame {

    Student[] group302 = new Student[10];
    String fileName = "";
    int fio;
    int group;
    int grade;
    int student = 0;
    private DefaultTableModel tm = new DefaultTableModel();
    private DefaultTableModel tm1 = new DefaultTableModel();

    public void Task6() {
        int[] ListTask6 = new int[11];
        for (int i = 0; i < ListTask6.length; i++) {
            ListTask6[i] = -100 + (int) (Math.random() * 200 + 1);
            // создаем масив и цикл,который генерирует рандомные числа
        }
        lblOutArray6.setText(Arrays.toString(ListTask6));
        // вывод исходного массива
        for (int i = 0; i < ListTask6.length; i++) {
            if (ListTask6[i] < 0) {
                ListTask6[i] = (int) Math.pow(ListTask6[i], 2);
                // создание цикла, который возводит отрицательные числа в квадрат
            }
        }
        lblAnswer6.setText(Arrays.toString(ListTask6));
        // вывод положительных чисел без квадрата и отрицательных с квадратом

    }

    public void Task31() {
        int[] ListTask31 = new int[20];
        for (int i = 0; i < ListTask31.length; i++) {
            ListTask31[i] = -100 + (int) (Math.random() * 200 + 1);
            // создаем масив и цикл,который генерирует рандомные числа
        }
        lblOutArray31.setText(Arrays.toString(ListTask31));
        //вывод исходного массива
        int min = 1000;
        for (int i = 0; i < ListTask31.length; i++) {
            if (ListTask31[i] > 0 & min > ListTask31[i]) {
                min = ListTask31[i];
                //поиск минимального числа
            }
        }
        lblAnswer31.setText(min + "");
        //вывод минимального числа из положительных чисел

    }

    public void Task56() {
        int[] ListTask56 = new int[15];
        for (int i = 0; i < ListTask56.length; i++) {
            ListTask56[i] = (int) (Math.random() * 10 + 1);
        } //создаем массив и цикл, который генерирует рандомные числа
        lblOutArray56.setText(Arrays.toString(ListTask56));
        // вывод исходного массива
        int total = 0;
        for (int i = 0; i < ListTask56.length; i++) {
            total += ListTask56[i];
            // цикл, который считает общую сумму
        }
        lblOutSumm56.setText(total + "");
        // вывод общей суммы

        int min = 100;
        for (int i = 0; i < ListTask56.length; i++) {
            if (min > ListTask56[i]) {
                min = ListTask56[i];
                lblOutNumber56.setText(i + 1 + "");
                // цикл, который ищет минимальное значение и выводит его порядковый номер
            }
        }
        lblOutZp56.setText(total / ListTask56.length + "");
        // вывод среднего арифметического значения
    }

    public void Task6_2() {
        String text1 = txtCountColumn.getText();
        if (text1.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Столбец не должнен быть пустым");
        } else {
            String text = txtCountLine.getText();
            if (text.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Строка не должна быть пустой");
            } else { //принимает текст из TextField, если текста нет, то не дает запустить программу
                tm = (DefaultTableModel) tblTab6Ch2.getModel();
                // метод, который отображает значения в таблице
                int row = Integer.parseInt(txtCountLine.getText());
                // это для Text Field, в который мы пишем значение строк
                int col = Integer.parseInt(txtCountColumn.getText());
                //это для Text Field, в который мы пишем значение столбцов
                tm.setColumnCount(col);
                int z = 0;
                int g = 0;
                int[][] LTask6_2 = new int[row][col];
                for (int i = 0; i < row; i++) {
                    Vector vr = new Vector();
                    for (int j = 0; j < col; j++) {
                        int theNubmer = (int) (Math.random() * 10 + 1);
                        LTask6_2[i][j] = theNubmer;
                        vr.add(LTask6_2[i][j]);
                        // создаем двумерный массив и цикл, который генерирует рандомные числа для матрицы
                    }
                    tm.addRow(vr);
                    // вывод рандомной матрицы в таблицу

                }
                int max = -1000;

                for (int i = 0; i < LTask6_2.length; i++) {
                    for (int j = 0; j < LTask6_2[0].length; j++) {

                        if (max < LTask6_2[i][j]) {
                            max = LTask6_2[i][j];
                            // цикл, который ищет максимальное число 
                            z = i;
                            g = j;
                            // переменные, которые будут отображать строку и столбец,в котором находится максимальное число

                        }
                    }
                }
                lblOutMax6Ch2.setText(max + "");
                // вывод максимального значения
                lblOutLine6Ch2.setText("" + (z + 1));
                // вывод строки, в которой находится максимальное значение
                lblOutColumn6Ch2.setText("" + (g + 1));
                // вывод столбца, в котором находится максимальное значение
            }
        }
    }

    public void Task31_2() {
        String text1 = txtCountLine31Ch2.getText();
        if (text1.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Строка не должна быть пустой");
        } else {
            String text = txtCountColumn31Ch2.getText();
            if (text.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Столбец не должен быть пустым");
            } else {//принимает текст из TextField, если текста нет, то не дает запустить программу

                tm = (DefaultTableModel) tblTab31Ch2.getModel();
                tm1 = (DefaultTableModel) tblMin31Ch2.getModel();
                int row = Integer.parseInt(txtCountLine31Ch2.getText());
                int col = Integer.parseInt(txtCountColumn31Ch2.getText());
                tm.setColumnCount(col);
                tm1.setColumnCount(col);
                int[][] LT31_2 = new int[3][4];
                //создание двумерного массива
                int[] Bmin = new int[col];
                //создание одномерного массива
                int min;
                for (int i = 0; i < row; i++) {
                    Vector vr = new Vector();
                    for (int j = 0; j < col; j++) {
                        int theNubmer = (int) (Math.random() * 18.99 + 1);
                        LT31_2[i][j] = theNubmer;
                        Bmin[i] = theNubmer;
                        vr.add(LT31_2[i][j]);
                        //цикл, который генерирует рандомные значения для матрицы
                    }
                    tm.addRow(vr);
                    //вывод исходной матрицы

                }
                min = 1000;

                for (int j = 0; j < row; j++) {

                    min = Integer.MAX_VALUE;
                    int min_i = 0;
                    for (int i = 0; i < col; i++) {
                        if (min > LT31_2[j][i]) {
                            min = LT31_2[j][i];
                            min_i = i;
                        }
                        int p = LT31_2[j][0];
                        LT31_2[j][0] = LT31_2[j][min_i];
                        LT31_2[j][min_i] = p;
//цикл,который ищет минимальное значение в строке и столбце, + обмен минимального числа на первую позицию в строке
                    }

                }
                for (int i = 0; i < row; i++) {
                    Vector vr1 = new Vector();
                    for (int j = 0; j < col; j++) {
                        vr1.add(LT31_2[i][j]);
                    }
                    tm1.addRow(vr1);
                    //вывод измененной матрицы

                }

            }
        }
    }

    public void Task6_3() {
        String text = txtEnterText6Ch3.getText();
        String newText = "";
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Строка не должна быть пустой");
        } else {//принимает текст из TextField, если текста нет, то не дает запустить программу
            if (text.contains(" ")) {
                newText = text.replace(" ", ", ");
            } //метод, которые меняет пробел на запятую и пробел
        }
        lblText6Ch3.setText(newText);
        //вывод измененного метода

    }

    public void Task31_3() {
        String text = txtEnterText31Ch3.getText();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Строка не должна быть пустой");
        } else {//принимает текст из TextField, если текста нет, то не дает запустить программу

            char[] chars = text.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                chars[i] = (char) (chars[i] + 3);
                //создание массива с циклом, который увеличивает символ на 3

            }
            String output = new String(chars);
            txtPreobraz31Ch3.setText(output);
            //вывод измененного символа
        }
    }

    public void Task56_3() {
        String text = txtLine1.getText();
        String text1 = txtLine2.getText();
        int sum1 = 0;
        int sum2 = 0;
        String str = Integer.toString(sum1);//конвертируем int в String
        String str1 = Integer.toString(sum2);
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Строка не должна быть пустой");
        } else {//принимает текст из TextField, если текста нет, то не дает запустить программу
            for (int i = 0; i < text.length(); i++) {
                if (Character.isDigit(text.charAt(i))) {
                    sum1 += Character.getNumericValue(text.charAt(i));//цикл,который выбирает цифры из введенной строки, если символ цифра, то прибавляем
                }
            }
        }
        for (int i = 0; i < text1.length(); i++) {
            if (Character.isDigit(text1.charAt(i))) {
                sum2 += Character.getNumericValue(text1.charAt(i));
                //цикл, который выбирает цифры из введенной строки, если символ цифра, то прибавляем
            }
        }
        txtSum1.setText(sum1 + ""); //вывод общей суммы
        txtSum2.setText(sum2 + "");
    }

    public void stud() {
        DefaultListModel<String> dwl = new DefaultListModel();
        Student[] array = new Student[10];
        String[] names = {"Alex", "Dima", "Artem", "Anton", "Alexander",
            "Danil", "Olga", "Nikita", "Oksana", "Alina"};
        String[] Surname = {"Molkov", "Kalashnikov", "Kalistratov", "Kuznetsov",
            "Pomelov", "Bragin", "Popova", "Rabov", "Zaiceva", "Chicken"};
        String[] Patronymic = {"Evgenivich", "Anatolevich", "Dmitrievich",
            "Jourivich", "Potapovich", "Antonovich", "Alexeevich", "Danilovich", "Tixonova", "Lolkovna"};
        int[] group = {300, 306, 302, 302, 302, 302, 302, 302, 302, 300}; //массив с номером группы
        int[] grade = {5, 4, 5, 3, 2, 5, 5, 5, 5, 3}; // массив с номером оценки
        for (int i = 0; i < 10; i++) {
            Student people = new Student(names[i], Surname[i], Patronymic[i], group[i], grade[i]);
            array[i] = people;
            dwl.addElement((i + 1) + ". " + people.getName() + " " + people.getSurname() + " " + people.getPatronymic()
                    + " Группа: " + people.getGroup() + " Оценка: " + people.getGrade());
        }//Добавление в лист студентов
        int total = 0;
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i].getGroup() == 302) {
                total += array[i].getGrade();
                count++;
                //среднее значение оценки из 302 группы
            }

        }
        ltFioGradeGroup.setModel(dwl); //вывод листа
        lblSrZnach.setText(total / count + ""); //вывод среднего значения
                
    }

    public labaratorka() {
        initComponents();
        btnSave.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabTask = new javax.swing.JTabbedPane();
        plChapter1 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        plTask6 = new javax.swing.JPanel();
        btnStart6Ch1 = new javax.swing.JButton();
        lblTask6 = new javax.swing.JLabel();
        lblAnswer6 = new javax.swing.JLabel();
        lblArray6 = new javax.swing.JLabel();
        lblOutArray6 = new javax.swing.JLabel();
        plTask31 = new javax.swing.JPanel();
        btnStart31Ch1 = new javax.swing.JButton();
        lblTask31 = new javax.swing.JLabel();
        lblAnswer31 = new javax.swing.JLabel();
        lblArray31 = new javax.swing.JLabel();
        lblOutArray31 = new javax.swing.JLabel();
        plTask56 = new javax.swing.JPanel();
        btnStart56Ch1 = new javax.swing.JButton();
        lblTask56 = new javax.swing.JLabel();
        lblAnswer56 = new javax.swing.JLabel();
        lblArray56 = new javax.swing.JLabel();
        lblOutArray56 = new javax.swing.JLabel();
        lblSumma56 = new javax.swing.JLabel();
        lblOutSumm56 = new javax.swing.JLabel();
        lblNumber56 = new javax.swing.JLabel();
        lblOutNumber56 = new javax.swing.JLabel();
        lblZp56 = new javax.swing.JLabel();
        lblOutZp56 = new javax.swing.JLabel();
        plChapter2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        plTask6Ch2 = new javax.swing.JPanel();
        lblTask6Ch2 = new javax.swing.JLabel();
        lblLine6Ch2 = new javax.swing.JLabel();
        btnStart6Ch2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTab6Ch2 = new javax.swing.JTable();
        lblColumn6Ch2 = new javax.swing.JLabel();
        lblMax6Ch2 = new javax.swing.JLabel();
        lblOutLine6Ch2 = new javax.swing.JLabel();
        lblOutColumn6Ch2 = new javax.swing.JLabel();
        lblOutMax6Ch2 = new javax.swing.JLabel();
        txtCountLine = new javax.swing.JTextField();
        txtCountColumn = new javax.swing.JTextField();
        lblCountLine6Ch2 = new javax.swing.JLabel();
        lblCountColumn6Ch2 = new javax.swing.JLabel();
        plTask31Ch31 = new javax.swing.JPanel();
        lblTask31Ch2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTab31Ch2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMin31Ch2 = new javax.swing.JTable();
        btnStart31Ch2 = new javax.swing.JButton();
        lblCountLine31Ch2 = new javax.swing.JLabel();
        lblCountColumn31Ch2 = new javax.swing.JLabel();
        txtCountLine31Ch2 = new javax.swing.JTextField();
        txtCountColumn31Ch2 = new javax.swing.JTextField();
        plChapter3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblTask6Ch3 = new javax.swing.JLabel();
        btnStart6Ch3 = new javax.swing.JButton();
        lblEnterText6Ch3 = new javax.swing.JLabel();
        txtEnterText6Ch3 = new javax.swing.JTextField();
        lblAnswerText6Ch3 = new javax.swing.JLabel();
        lblText6Ch3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblTask31Ch3 = new javax.swing.JLabel();
        lblEnterText31Ch3 = new javax.swing.JLabel();
        txtEnterText31Ch3 = new javax.swing.JTextField();
        btnStart31Ch3 = new javax.swing.JButton();
        lblPreobrazovanie31Ch3 = new javax.swing.JLabel();
        txtPreobraz31Ch3 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lblTask56Ch3 = new javax.swing.JLabel();
        btnStart56Ch3 = new javax.swing.JButton();
        lblLine1Ch3 = new javax.swing.JLabel();
        lblLine2Ch3 = new javax.swing.JLabel();
        lblSumLine1 = new javax.swing.JLabel();
        lblSumLine2 = new javax.swing.JLabel();
        txtLine1 = new javax.swing.JTextField();
        txtLine2 = new javax.swing.JTextField();
        txtSum1 = new javax.swing.JTextField();
        txtSum2 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        plTask31Ch4 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        lblTask6Ch4 = new javax.swing.JLabel();
        btnStart6Ch4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        lblTask31Ch4 = new javax.swing.JLabel();
        btnStart31Ch4 = new javax.swing.JButton();
        lblSrZnachGrade = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ltFioGradeGroup = new javax.swing.JList<>();
        lblSredneeZnachenie = new javax.swing.JLabel();
        lblSrZnach = new javax.swing.JLabel();
        lblAnswerin = new javax.swing.JLabel();
        txtAnswer = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblAdress = new javax.swing.JLabel();
        txtAdress = new javax.swing.JTextField();
        plPractic = new javax.swing.JPanel();
        plTab2 = new javax.swing.JPanel();
        jTabPan1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabOsn = new javax.swing.JTable();
        btnStartPr = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        FileLabaratorka = new javax.swing.JMenu();
        ExitLabaratorka = new javax.swing.JMenuItem();
        EditLabaratorka = new javax.swing.JMenu();
        AboutTheProgrammLabaratorka = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        plTask6.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                plTask6AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        btnStart6Ch1.setText("Выполнить");
        btnStart6Ch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart6Ch1ActionPerformed(evt);
            }
        });

        lblTask6.setText("<html> Заменить отрицательные элементы в числовом массиве из n чисел (n>10) их квадратами, оставив <p>остальные без изменения.</html>");

        lblAnswer6.setText("Ответ:");
        lblAnswer6.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblAnswer6AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lblArray6.setText("Массив:");

        lblOutArray6.setText("0");

        javax.swing.GroupLayout plTask6Layout = new javax.swing.GroupLayout(plTask6);
        plTask6.setLayout(plTask6Layout);
        plTask6Layout.setHorizontalGroup(
            plTask6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plTask6Layout.createSequentialGroup()
                .addGroup(plTask6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plTask6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(plTask6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTask6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAnswer6)
                            .addGroup(plTask6Layout.createSequentialGroup()
                                .addComponent(lblArray6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOutArray6))))
                    .addGroup(plTask6Layout.createSequentialGroup()
                        .addGap(481, 481, 481)
                        .addComponent(btnStart6Ch1)))
                .addContainerGap(334, Short.MAX_VALUE))
        );
        plTask6Layout.setVerticalGroup(
            plTask6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plTask6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTask6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lblAnswer6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(plTask6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArray6)
                    .addComponent(lblOutArray6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(btnStart6Ch1))
        );

        jTabbedPane3.addTab("Задание 6", plTask6);

        btnStart31Ch1.setText("Выполнить");
        btnStart31Ch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart31Ch1ActionPerformed(evt);
            }
        });

        lblTask31.setText(" Задан одномерный массив А[1..20]. Найти минимальный элемент среди положительных элементов.");

        lblAnswer31.setText("Ответ:");

        lblArray31.setText("Массив:");

        lblOutArray31.setText("0");

        javax.swing.GroupLayout plTask31Layout = new javax.swing.GroupLayout(plTask31);
        plTask31.setLayout(plTask31Layout);
        plTask31Layout.setHorizontalGroup(
            plTask31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plTask31Layout.createSequentialGroup()
                .addComponent(lblTask31)
                .addGap(0, 345, Short.MAX_VALUE))
            .addGroup(plTask31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plTask31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plTask31Layout.createSequentialGroup()
                        .addComponent(lblAnswer31)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(plTask31Layout.createSequentialGroup()
                        .addComponent(lblArray31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOutArray31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(plTask31Layout.createSequentialGroup()
                .addGap(491, 491, 491)
                .addComponent(btnStart31Ch1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        plTask31Layout.setVerticalGroup(
            plTask31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plTask31Layout.createSequentialGroup()
                .addComponent(lblTask31)
                .addGap(58, 58, 58)
                .addComponent(lblAnswer31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(plTask31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArray31)
                    .addComponent(lblOutArray31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(btnStart31Ch1)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Задание 31", plTask31);

        btnStart56Ch1.setText("Выполнить");
        btnStart56Ch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart56Ch1ActionPerformed(evt);
            }
        });

        lblTask56.setText("<html>В одномерном массиве хранится информация о зарплате 15 человек,<p> работающих в отделе. Составить программу для определения: а) итоговой суммы по всему отделу; б)<p> порядкового номера человека, получившего наименьшую зарплату; в) средней зарплаты по отделу.");

        lblAnswer56.setText("Ответ:");

        lblArray56.setText("Массив:");

        lblOutArray56.setText("0");

        lblSumma56.setText("Сумма:");

        lblOutSumm56.setText("0");

        lblNumber56.setText("Порядковый номер:");

        lblOutNumber56.setText("0");

        lblZp56.setText("Средняя зарплата:");

        lblOutZp56.setText("0");

        javax.swing.GroupLayout plTask56Layout = new javax.swing.GroupLayout(plTask56);
        plTask56.setLayout(plTask56Layout);
        plTask56Layout.setHorizontalGroup(
            plTask56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plTask56Layout.createSequentialGroup()
                .addGroup(plTask56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTask56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(plTask56Layout.createSequentialGroup()
                        .addComponent(lblAnswer56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSumma56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOutSumm56))
                    .addGroup(plTask56Layout.createSequentialGroup()
                        .addComponent(lblArray56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblOutArray56, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(plTask56Layout.createSequentialGroup()
                        .addComponent(lblNumber56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblOutNumber56))
                    .addGroup(plTask56Layout.createSequentialGroup()
                        .addComponent(lblZp56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOutZp56)))
                .addGap(0, 293, Short.MAX_VALUE))
            .addGroup(plTask56Layout.createSequentialGroup()
                .addGap(472, 472, 472)
                .addComponent(btnStart56Ch1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        plTask56Layout.setVerticalGroup(
            plTask56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plTask56Layout.createSequentialGroup()
                .addComponent(lblTask56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(plTask56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnswer56)
                    .addComponent(lblSumma56)
                    .addComponent(lblOutSumm56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plTask56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumber56)
                    .addComponent(lblOutNumber56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plTask56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZp56)
                    .addComponent(lblOutZp56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(plTask56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArray56)
                    .addComponent(lblOutArray56))
                .addGap(38, 38, 38)
                .addComponent(btnStart56Ch1))
        );

        jTabbedPane3.addTab("Задание 56", plTask56);

        javax.swing.GroupLayout plChapter1Layout = new javax.swing.GroupLayout(plChapter1);
        plChapter1.setLayout(plChapter1Layout);
        plChapter1Layout.setHorizontalGroup(
            plChapter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        plChapter1Layout.setVerticalGroup(
            plChapter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        tabTask.addTab("Раздел 1", plChapter1);

        lblTask6Ch2.setText("<html>Составить программу для определения номера строки и номера столбца прямоугольной матрицы,на пересечении которых находится наибольший по абсолютной величине элемент этой матрицы.");

        lblLine6Ch2.setText("Строка:");

        btnStart6Ch2.setText("Выполнить");
        btnStart6Ch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart6Ch2ActionPerformed(evt);
            }
        });

        tblTab6Ch2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblTab6Ch2);

        lblColumn6Ch2.setText("Столбец:");

        lblMax6Ch2.setText("Максимальный элемент:");

        lblOutLine6Ch2.setText("0");

        lblOutColumn6Ch2.setText("0");

        lblOutMax6Ch2.setText("0");

        txtCountLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCountLineActionPerformed(evt);
            }
        });

        lblCountLine6Ch2.setText("Укажите кол-во строк:");

        lblCountColumn6Ch2.setText("Укажите кол-во столбцов:");

        javax.swing.GroupLayout plTask6Ch2Layout = new javax.swing.GroupLayout(plTask6Ch2);
        plTask6Ch2.setLayout(plTask6Ch2Layout);
        plTask6Ch2Layout.setHorizontalGroup(
            plTask6Ch2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plTask6Ch2Layout.createSequentialGroup()
                .addGroup(plTask6Ch2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plTask6Ch2Layout.createSequentialGroup()
                        .addComponent(lblCountLine6Ch2)
                        .addGap(26, 26, 26)
                        .addComponent(txtCountLine, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plTask6Ch2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plTask6Ch2Layout.createSequentialGroup()
                        .addComponent(lblLine6Ch2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblOutLine6Ch2)
                        .addGap(363, 363, 363))
                    .addGroup(plTask6Ch2Layout.createSequentialGroup()
                        .addGroup(plTask6Ch2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(plTask6Ch2Layout.createSequentialGroup()
                                .addComponent(lblMax6Ch2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOutMax6Ch2))
                            .addGroup(plTask6Ch2Layout.createSequentialGroup()
                                .addComponent(lblColumn6Ch2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOutColumn6Ch2))
                            .addComponent(btnStart6Ch2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(plTask6Ch2Layout.createSequentialGroup()
                .addGroup(plTask6Ch2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTask6Ch2, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(plTask6Ch2Layout.createSequentialGroup()
                        .addComponent(lblCountColumn6Ch2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCountColumn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        plTask6Ch2Layout.setVerticalGroup(
            plTask6Ch2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plTask6Ch2Layout.createSequentialGroup()
                .addComponent(lblTask6Ch2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plTask6Ch2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plTask6Ch2Layout.createSequentialGroup()
                        .addGroup(plTask6Ch2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLine6Ch2)
                            .addComponent(lblOutLine6Ch2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(plTask6Ch2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblColumn6Ch2)
                            .addComponent(lblOutColumn6Ch2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(plTask6Ch2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMax6Ch2)
                            .addComponent(lblOutMax6Ch2))
                        .addGap(2, 2, 2)
                        .addComponent(btnStart6Ch2))
                    .addGroup(plTask6Ch2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(plTask6Ch2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCountLine6Ch2)
                            .addComponent(txtCountLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plTask6Ch2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCountColumn6Ch2)
                    .addComponent(txtCountColumn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Задание 6", plTask6Ch2);

        lblTask31Ch2.setText("<html>Вывести на экран матрицу 3х4, элементами которой являются целые случайные числа из интервала [19,99]. <p>Определить минимальный элемент каждой строки и поменять его местами с первым элементом строки.");

        tblTab31Ch2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Столбец 1", "Столбец 2", "Столбец 3"
            }
        ));
        jScrollPane3.setViewportView(tblTab31Ch2);

        tblMin31Ch2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Min"
            }
        ));
        jScrollPane4.setViewportView(tblMin31Ch2);

        btnStart31Ch2.setText("Выполнить");
        btnStart31Ch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart31Ch2ActionPerformed(evt);
            }
        });

        lblCountLine31Ch2.setText("Укажите кол-во строк:");

        lblCountColumn31Ch2.setText("Укажите кол-во столбцов:");

        txtCountLine31Ch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCountLine31Ch2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plTask31Ch31Layout = new javax.swing.GroupLayout(plTask31Ch31);
        plTask31Ch31.setLayout(plTask31Ch31Layout);
        plTask31Ch31Layout.setHorizontalGroup(
            plTask31Ch31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plTask31Ch31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plTask31Ch31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plTask31Ch31Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(plTask31Ch31Layout.createSequentialGroup()
                        .addGroup(plTask31Ch31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCountColumn31Ch2)
                            .addComponent(lblCountLine31Ch2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(plTask31Ch31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCountLine31Ch2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCountColumn31Ch2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(plTask31Ch31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStart31Ch2))
                .addGap(154, 212, Short.MAX_VALUE))
            .addGroup(plTask31Ch31Layout.createSequentialGroup()
                .addComponent(lblTask31Ch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        plTask31Ch31Layout.setVerticalGroup(
            plTask31Ch31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plTask31Ch31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTask31Ch2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(plTask31Ch31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(plTask31Ch31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plTask31Ch31Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(plTask31Ch31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCountLine31Ch2)
                            .addComponent(txtCountLine31Ch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(plTask31Ch31Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStart31Ch2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(plTask31Ch31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCountColumn31Ch2)
                    .addComponent(txtCountColumn31Ch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Задание 31", plTask31Ch31);

        javax.swing.GroupLayout plChapter2Layout = new javax.swing.GroupLayout(plChapter2);
        plChapter2.setLayout(plChapter2Layout);
        plChapter2Layout.setHorizontalGroup(
            plChapter2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plChapter2Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 130, Short.MAX_VALUE))
        );
        plChapter2Layout.setVerticalGroup(
            plChapter2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        tabTask.addTab("Раздел 2", plChapter2);

        lblTask6Ch3.setText("В тексте вставить между словами вместо одного пробела запятую и пробел.");

        btnStart6Ch3.setText("Выполнить");
        btnStart6Ch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart6Ch3ActionPerformed(evt);
            }
        });

        lblEnterText6Ch3.setText("Введите текст:");

        lblAnswerText6Ch3.setText("Ответ:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnStart6Ch3)
                .addGap(289, 289, 289))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTask6Ch3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEnterText6Ch3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEnterText6Ch3, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAnswerText6Ch3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblText6Ch3)))
                .addContainerGap(309, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTask6Ch3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterText6Ch3)
                    .addComponent(txtEnterText6Ch3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnswerText6Ch3)
                    .addComponent(lblText6Ch3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(btnStart6Ch3)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Задание 6", jPanel1);

        lblTask31Ch3.setText("Преобразовать буквы введенной строки так, чтобы их ASCII-коды увеличились на 3.");

        lblEnterText31Ch3.setText("Введите текст:");

        btnStart31Ch3.setText("Выполнить");
        btnStart31Ch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart31Ch3ActionPerformed(evt);
            }
        });

        lblPreobrazovanie31Ch3.setText("Преобразование:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTask31Ch3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(lblPreobrazovanie31Ch3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtPreobraz31Ch3))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnStart31Ch3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblEnterText31Ch3)
                                .addGap(18, 18, 18)
                                .addComponent(txtEnterText31Ch3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(273, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTask31Ch3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEnterText31Ch3)
                    .addComponent(txtEnterText31Ch3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreobrazovanie31Ch3)
                    .addComponent(txtPreobraz31Ch3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(btnStart31Ch3)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Задание 31", jPanel2);

        lblTask56Ch3.setText("Даны 2 строки. Определить сумму цифр в каждой из них (создать функцию, подсчитывающую сумму цифр)");

        btnStart56Ch3.setText("Выполнить");
        btnStart56Ch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart56Ch3ActionPerformed(evt);
            }
        });

        lblLine1Ch3.setText("1 Строка:");

        lblLine2Ch3.setText("2 Строка:");

        lblSumLine1.setText("Сумма 1 строки:");

        lblSumLine2.setText("Сумма 2 строки:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnStart56Ch3)
                .addGap(146, 146, 146))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTask56Ch3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLine1Ch3)
                            .addComponent(lblLine2Ch3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLine1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(txtLine2)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(lblSumLine2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtSum2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(lblSumLine1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtSum1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTask56Ch3)
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLine1Ch3)
                    .addComponent(txtLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLine2Ch3)
                    .addComponent(txtLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSumLine1)
                    .addComponent(txtSum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSumLine2)
                    .addComponent(txtSum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(btnStart56Ch3)
                .addGap(45, 45, 45))
        );

        jTabbedPane2.addTab("Задание 56", jPanel4);

        javax.swing.GroupLayout plChapter3Layout = new javax.swing.GroupLayout(plChapter3);
        plChapter3.setLayout(plChapter3Layout);
        plChapter3Layout.setHorizontalGroup(
            plChapter3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plChapter3Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 161, Short.MAX_VALUE))
        );
        plChapter3Layout.setVerticalGroup(
            plChapter3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        tabTask.addTab("Раздел 3", plChapter3);

        lblTask6Ch4.setText("Протабулировать функцию y=sin(x + x2 ) для -2pi<=x<=2pi с шагом pi/10. Записать данные в файл и просмотреть данные из файла.");

        btnStart6Ch4.setText("Выполнить");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnStart6Ch4)
                    .addComponent(lblTask6Ch4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTask6Ch4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(btnStart6Ch4)
                .addGap(102, 102, 102))
        );

        plTask31Ch4.addTab("Задание 6", jPanel6);

        lblTask31Ch4.setText("<html>Создать файл, содержащий данные: ФИО студента; группа; оценка по информатике. <p>Просмотреть записи. Определить среднюю оценку по информатике в 302 группе.");

        btnStart31Ch4.setText("Выполнить");
        btnStart31Ch4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart31Ch4ActionPerformed(evt);
            }
        });

        jScrollPane5.setViewportView(ltFioGradeGroup);

        lblSredneeZnachenie.setText("Средняя оценка по информатике:");

        lblAnswerin.setText("Сохранить ответ в:");

        btnSave.setText("Сохранить");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblAdress.setText("Введите имя файла:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTask31Ch4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnStart31Ch4)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblSrZnachGrade)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(lblSredneeZnachenie)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblSrZnach, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblAnswerin)
                                        .addComponent(lblAdress))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                        .addComponent(txtAdress)))
                                .addComponent(btnSave))
                            .addGap(116, 116, 116))))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTask31Ch4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblSrZnach, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(lblSredneeZnachenie)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAdress)
                            .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAnswerin)
                            .addComponent(txtAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSrZnachGrade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnStart31Ch4))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        plTask31Ch4.addTab("Задание 31", jPanel7);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plTask31Ch4, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plTask31Ch4)
        );

        tabTask.addTab("Раздел 4", jPanel5);

        tblTabOsn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", null, null, null, null, null},
                {"2", null, null, null, null, null},
                {"3", null, null, null, null, null},
                {"4", null, null, null, null, null},
                {"5", null, null, null, null, null},
                {"6", null, null, null, null, null}
            },
            new String [] {
                "Столбец 1", "Столбец 2", "Столбец 3", "Столбец 4", "Столбец 5", "Столбец 6"
            }
        ));
        jScrollPane1.setViewportView(tblTabOsn);

        btnStartPr.setText("Выполнить");
        btnStartPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartPrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnStartPr)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 251, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnStartPr)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jTabPan1.addTab("Таблица", jPanel3);

        javax.swing.GroupLayout plTab2Layout = new javax.swing.GroupLayout(plTab2);
        plTab2.setLayout(plTab2Layout);
        plTab2Layout.setHorizontalGroup(
            plTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabPan1)
        );
        plTab2Layout.setVerticalGroup(
            plTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plTab2Layout.createSequentialGroup()
                .addComponent(jTabPan1)
                .addContainerGap())
        );

        javax.swing.GroupLayout plPracticLayout = new javax.swing.GroupLayout(plPractic);
        plPractic.setLayout(plPracticLayout);
        plPracticLayout.setHorizontalGroup(
            plPracticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plPracticLayout.createSequentialGroup()
                .addComponent(plTab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        plPracticLayout.setVerticalGroup(
            plPracticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plTab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabTask.addTab("Практика", plPractic);

        FileLabaratorka.setText("File");

        ExitLabaratorka.setText("Выйти");
        ExitLabaratorka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitLabaratorkaActionPerformed(evt);
            }
        });
        FileLabaratorka.add(ExitLabaratorka);

        jMenuBar2.add(FileLabaratorka);

        EditLabaratorka.setText("Edit");

        AboutTheProgrammLabaratorka.setText("О Программе:");
        AboutTheProgrammLabaratorka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutTheProgrammLabaratorkaActionPerformed(evt);
            }
        });
        EditLabaratorka.add(AboutTheProgrammLabaratorka);

        jMenuBar2.add(EditLabaratorka);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabTask)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabTask)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStart56Ch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart56Ch1ActionPerformed
        Task56();
    }//GEN-LAST:event_btnStart56Ch1ActionPerformed

    private void btnStart6Ch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart6Ch1ActionPerformed
        Task6();
    }//GEN-LAST:event_btnStart6Ch1ActionPerformed

    private void lblAnswer6AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblAnswer6AncestorAdded

    }//GEN-LAST:event_lblAnswer6AncestorAdded

    private void plTask6AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_plTask6AncestorAdded

    }//GEN-LAST:event_plTask6AncestorAdded

    private void btnStart31Ch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart31Ch1ActionPerformed
        Task31();
    }//GEN-LAST:event_btnStart31Ch1ActionPerformed

    private void btnStartPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartPrActionPerformed

    }//GEN-LAST:event_btnStartPrActionPerformed

    private void btnStart6Ch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart6Ch2ActionPerformed
        tm.setRowCount(0);
        Task6_2();
    }//GEN-LAST:event_btnStart6Ch2ActionPerformed

    private void btnStart31Ch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart31Ch2ActionPerformed
        tm.setRowCount(0);
        tm1.setRowCount(0);
        Task31_2();
    }//GEN-LAST:event_btnStart31Ch2ActionPerformed

    private void txtCountLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCountLineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountLineActionPerformed

    private void txtCountLine31Ch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCountLine31Ch2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountLine31Ch2ActionPerformed

    private void ExitLabaratorkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitLabaratorkaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitLabaratorkaActionPerformed

    private void AboutTheProgrammLabaratorkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutTheProgrammLabaratorkaActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Разработчик: Калашников Д.А, Группа: 21-ИС-1. Программа была написана в 2023 году.");
    }//GEN-LAST:event_AboutTheProgrammLabaratorkaActionPerformed

    private void btnStart6Ch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart6Ch3ActionPerformed
        Task6_3();
    }//GEN-LAST:event_btnStart6Ch3ActionPerformed

    private void btnStart31Ch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart31Ch3ActionPerformed
        Task31_3();
    }//GEN-LAST:event_btnStart31Ch3ActionPerformed

    private void btnStart56Ch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart56Ch3ActionPerformed
        Task56_3();
    }//GEN-LAST:event_btnStart56Ch3ActionPerformed

    private void btnStart31Ch4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart31Ch4ActionPerformed
        stud();        // TODO add your handling code here:
    }//GEN-LAST:event_btnStart31Ch4ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtAdress.getText().isEmpty() || txtAnswer.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Введите имя файла и путь");
        } else {
            fileName = txtAnswer.getText() + txtAdress.getText() + ".txt";
            String text = ("Средний балл по информатике в 302 группе: " + lblSrZnach.getText() + "");
            Files.savefile(fileName, text);
            btnSave.setVisible(true);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(labaratorka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(labaratorka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(labaratorka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(labaratorka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new labaratorka().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AboutTheProgrammLabaratorka;
    private javax.swing.JMenu EditLabaratorka;
    private javax.swing.JMenuItem ExitLabaratorka;
    private javax.swing.JMenu FileLabaratorka;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnStart31Ch1;
    private javax.swing.JButton btnStart31Ch2;
    private javax.swing.JButton btnStart31Ch3;
    private javax.swing.JButton btnStart31Ch4;
    private javax.swing.JButton btnStart56Ch1;
    private javax.swing.JButton btnStart56Ch3;
    private javax.swing.JButton btnStart6Ch1;
    private javax.swing.JButton btnStart6Ch2;
    private javax.swing.JButton btnStart6Ch3;
    private javax.swing.JButton btnStart6Ch4;
    private javax.swing.JButton btnStartPr;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabPan1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel lblAdress;
    private javax.swing.JLabel lblAnswer31;
    private javax.swing.JLabel lblAnswer56;
    private javax.swing.JLabel lblAnswer6;
    private javax.swing.JLabel lblAnswerText6Ch3;
    private javax.swing.JLabel lblAnswerin;
    private javax.swing.JLabel lblArray31;
    private javax.swing.JLabel lblArray56;
    private javax.swing.JLabel lblArray6;
    private javax.swing.JLabel lblColumn6Ch2;
    private javax.swing.JLabel lblCountColumn31Ch2;
    private javax.swing.JLabel lblCountColumn6Ch2;
    private javax.swing.JLabel lblCountLine31Ch2;
    private javax.swing.JLabel lblCountLine6Ch2;
    private javax.swing.JLabel lblEnterText31Ch3;
    private javax.swing.JLabel lblEnterText6Ch3;
    private javax.swing.JLabel lblLine1Ch3;
    private javax.swing.JLabel lblLine2Ch3;
    private javax.swing.JLabel lblLine6Ch2;
    private javax.swing.JLabel lblMax6Ch2;
    private javax.swing.JLabel lblNumber56;
    private javax.swing.JLabel lblOutArray31;
    private javax.swing.JLabel lblOutArray56;
    private javax.swing.JLabel lblOutArray6;
    private javax.swing.JLabel lblOutColumn6Ch2;
    private javax.swing.JLabel lblOutLine6Ch2;
    private javax.swing.JLabel lblOutMax6Ch2;
    private javax.swing.JLabel lblOutNumber56;
    private javax.swing.JLabel lblOutSumm56;
    private javax.swing.JLabel lblOutZp56;
    private javax.swing.JLabel lblPreobrazovanie31Ch3;
    private javax.swing.JLabel lblSrZnach;
    private javax.swing.JLabel lblSrZnachGrade;
    private javax.swing.JLabel lblSredneeZnachenie;
    private javax.swing.JLabel lblSumLine1;
    private javax.swing.JLabel lblSumLine2;
    private javax.swing.JLabel lblSumma56;
    private javax.swing.JLabel lblTask31;
    private javax.swing.JLabel lblTask31Ch2;
    private javax.swing.JLabel lblTask31Ch3;
    private javax.swing.JLabel lblTask31Ch4;
    private javax.swing.JLabel lblTask56;
    private javax.swing.JLabel lblTask56Ch3;
    private javax.swing.JLabel lblTask6;
    private javax.swing.JLabel lblTask6Ch2;
    private javax.swing.JLabel lblTask6Ch3;
    private javax.swing.JLabel lblTask6Ch4;
    private javax.swing.JLabel lblText6Ch3;
    private javax.swing.JLabel lblZp56;
    private javax.swing.JList<String> ltFioGradeGroup;
    private javax.swing.JPanel plChapter1;
    private javax.swing.JPanel plChapter2;
    private javax.swing.JPanel plChapter3;
    private javax.swing.JPanel plPractic;
    private javax.swing.JPanel plTab2;
    private javax.swing.JPanel plTask31;
    private javax.swing.JPanel plTask31Ch31;
    private javax.swing.JTabbedPane plTask31Ch4;
    private javax.swing.JPanel plTask56;
    private javax.swing.JPanel plTask6;
    private javax.swing.JPanel plTask6Ch2;
    private javax.swing.JTabbedPane tabTask;
    private javax.swing.JTable tblMin31Ch2;
    private javax.swing.JTable tblTab31Ch2;
    private javax.swing.JTable tblTab6Ch2;
    private javax.swing.JTable tblTabOsn;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JTextField txtCountColumn;
    private javax.swing.JTextField txtCountColumn31Ch2;
    private javax.swing.JTextField txtCountLine;
    private javax.swing.JTextField txtCountLine31Ch2;
    private javax.swing.JTextField txtEnterText31Ch3;
    private javax.swing.JTextField txtEnterText6Ch3;
    private javax.swing.JTextField txtLine1;
    private javax.swing.JTextField txtLine2;
    private javax.swing.JTextField txtPreobraz31Ch3;
    private javax.swing.JTextField txtSum1;
    private javax.swing.JTextField txtSum2;
    // End of variables declaration//GEN-END:variables
}
