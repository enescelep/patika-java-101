package studentinfosystem;
/*
        Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin.
        Sözlü notlarınıda ortalamaya etkileme yüzdesi ile dahil edin.
        Örnek : Fizik dersinine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.
        Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :
        Fizik Ortalaması : (90 * 0.20) + (60* 0.80);
*/
public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    double verbalNoteEffect;
    double examNoteEffect;
    int note;
    int verbalNote;

    public Course(String name, String code, String prefix, float verbalNoteEffect) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.verbalNoteEffect = verbalNoteEffect;
        this.examNoteEffect = 1.0 - this.verbalNoteEffect;
        this.note = 0;
        this.verbalNote = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
