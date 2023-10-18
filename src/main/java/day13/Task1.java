package day13;

public class Task1 {
    public static void main(String[] args) {

        User firstUser = new User("Олег");
        User secondUser = new User("Альберт");
        User thirdUser = new User("Мага");

        firstUser.sendMessage(secondUser, "Привет!");
        firstUser.sendMessage(secondUser, "Как дела?");

        secondUser.sendMessage(firstUser, "Здорова");
        secondUser.sendMessage(firstUser, "У меня все хорошо");
        secondUser.sendMessage(firstUser, "Отдыхаю");

        thirdUser.sendMessage(firstUser, "Привет, это " + thirdUser.getUsername());
        thirdUser.sendMessage(firstUser, "Давно не виделись" );
        thirdUser.sendMessage(firstUser, "Хочешь встретиться?" );

        firstUser.sendMessage(thirdUser, "Привет!");
        firstUser.sendMessage(thirdUser, "Согласен");
        firstUser.sendMessage(thirdUser, "Я свободен завтра. Давай увидимся в 10:00");

        thirdUser.sendMessage(firstUser, "Договорились, буду ждать тебя там же, где и раньше" );

        MessageDatabase.showDialog(firstUser, thirdUser);
    }
}
