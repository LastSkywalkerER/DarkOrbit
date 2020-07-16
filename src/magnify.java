// Java-программа для создания увеличительного инструмента
// используя Java Robot



import java.awt.event.*;

import javax.swing.*;

import java.awt.*;

class magnify extends JFrame {



    // объект

    static magnify m;



    // изображение

    Image i;



    // по умолчанию constrcutor

    magnify()

    {

        // создать рамку

        super("magnify");



        // установить размер кадра

        setSize(200, 220);

        show();



        // функция увеличения изображения

        work();

    }



    // основная функция

    public static void main(String args[])

    {



        // объект класса

        m = new magnify();

    }



    public void work()

    {

        try {

            // создать робота

            Robot r = new Robot();



            // пока рамка видна

            while (isVisible()) {

                // получить положение мыши

                Point p = MouseInfo.getPointerInfo().getLocation();



                // создаем снимок экрана вокруг указателя мыши

                i = r.createScreenCapture(new Rectangle((int)p.getX() - 30,

                        (int)p.getY() - 30, 150, 150));



                // перекрасить конатинер

                repaint();

            }

            // выход из программы

            System.exit(0);

        }

        catch (Exception e) {

            System.err.println(e.getMessage());

        }

    }



    // функция рисования

    public void paint(Graphics g)

    {



        // рисуем изображение

        g.drawImage(i, 0, 0, 300, 300, this);

    }

}