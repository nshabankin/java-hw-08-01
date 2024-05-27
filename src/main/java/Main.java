public class Main {
    public static void main(String[] args) {
        Post post = new Post(); // объект класса Post

        post.name = "Иван"; // заполнить поле "имя"
        post.passport = "4444 № 44444444"; // заполнить поле "паспорт"
        post.patronymic = "Иванович"; // заполнить поле "отчество"
        post.phone = "+7 (999)-999-99-99"; // заполнить поле "номер телефона"
        post.surname = "Иванов"; // заполнить поле "фамилия"
        post.subscription = true; // заполнить поле "наличие подписки"

        post.birthday = new FormDate(); // объект класса FormDate

        post.birthday.day = 13; // заполнить поле "день"
        post.birthday.month = 6; // заполнить поле "месяц"
        post.birthday.year = 1999; // заполнить поле "год"
    }
}