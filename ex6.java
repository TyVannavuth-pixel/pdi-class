import java.util.Scanner;
        Scanner input = new Scanner(System.in);

        System.out.print("Input your scores of 4 subjects (Math, English, Physics, and Programming): ");
        int math = input.nextInt();
        int english = input.nextInt();
        int physics = input.nextInt();
        int programming = input.nextInt();

        int max = math;
        int min = math;
        if (english > max) max = english;
        if (physics > max) max = physics;
        if (programming > max) max = programming;
        if (english < min) min = english;
        if (physics < min) min = physics;
        if (programming < min) min = programming;

        double average = (math + english + physics + programming) / 4.0;

        System.out.print("Max score is: " + max + " (");
        if (math == max) System.out.print("Math ");
        if (english == max) System.out.print("English ");
        if (physics == max) System.out.print("Physics ");
        if (programming == max) System.out.print("Programming ");
        System.out.println("course)");

        System.out.print("Min score is: " + min + " (");
        if (math == min) System.out.print("Math ");
        if (english == min) System.out.print("English ");
        if (physics == min) System.out.print("Physics ");
        if (programming == min) System.out.print("Programming ");
        System.out.println("course)");

        System.out.println("Average score of this student is: " + average);

        input.close();
    }
}
