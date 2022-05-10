package peaksoft;
/*1) Cat деген POJO класс тузунуз
2) AppConfig класстын ичинде cat деген класска бин тузунуз
3) Ал бинди ар бир чакырганда жаны объект тузуло тургандай кылып настройка кылыныз
4) App классында HelloWorldду дагы бир жолу жана Catти эки жолу чакырыныз. Аларды ссылкасы менен салыштырып коруп жообун консольго чыгарыныз.
5) Тестти комментарийден чыгарып иштетип корунуз*/
public class Cat {

    private String message;

    public Cat() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
