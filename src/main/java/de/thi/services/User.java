package de.thi.services;

public class User {
    private String vorname;
    private String nachname;
    private int alter;
    private String mitgliedschaft;
    private int mitgliedschaftsdauer;
    private String artDerAktivitaet;
    private boolean ehrenmitglied;

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getMitgliedschaft() {
        return mitgliedschaft;
    }

    public void setMitgliedschaft(String mitgliedschaft) {
        this.mitgliedschaft = mitgliedschaft;
    }

    public int getMitgliedschaftsdauer() {
        return mitgliedschaftsdauer;
    }

    public void setMitgliedschaftsdauer(int mitgliedschaftsdauer) {
        this.mitgliedschaftsdauer = mitgliedschaftsdauer;
    }

    public String getArtDerAktivitaet() {
        return artDerAktivitaet;
    }

    public void setArtDerAktivitaet(String artDerAktivitaet) {
        this.artDerAktivitaet = artDerAktivitaet;
    }

    public boolean isEhrenmitglied() {
        return ehrenmitglied;
    }

    public void setEhrenmitglied(boolean ehrenmitglied) {
        this.ehrenmitglied = ehrenmitglied;
    }
}