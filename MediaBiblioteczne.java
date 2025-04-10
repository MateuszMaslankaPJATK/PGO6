public class MediaBiblioteczne {
    protected String tytul;
    protected int rokWydania;
    protected boolean dostepny;

    public MediaBiblioteczne(String tytul, int rokWydania) {
        this.tytul = tytul;
        this.rokWydania = rokWydania;
        this.dostepny = true;
    }

    public void wypozycz() {
        if (dostepny) {
            dostepny = false;
            System.out.println(tytul + " został wypożyczony.");
        } else {
            System.out.println(tytul + " jest już wypożyczony.");
        }
    }

    public void zwroc() {
        if (!dostepny) {
            dostepny = true;
            System.out.println(tytul + " został zwrócony.");
        } else {
            System.out.println(tytul + " nie był wypożyczony.");
        }
    }

    public void wyswietlInformacje() {
        String status = dostepny ? "Dostępne" : "Wypożyczone";
        System.out.println("Tytuł: " + tytul);
        System.out.println("Rok wydania: " + rokWydania);
        System.out.println("Status: " + status);
    }
}