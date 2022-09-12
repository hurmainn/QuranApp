package com.example.quranappnew;

public class tayah {
    private int AyaID;
    private int SurahID;
    private int AyahNo;
    private String ArabicText;
    private String FatehMuhammadJaland;
    private String MehmoodulHassan;
    private String DrMohsinKhan;
    private String MuftitakiUsmani;
    private int RukuID;
    private int PRakuID;
    private int ParaID;

    public int getAyaID() {
        return AyaID;
    }

    public void setAyaID(int ayaID) {
        AyaID = ayaID;
    }

    public int getSurahID() {
        return SurahID;
    }

    public void setSurahID(int surahID) {
        SurahID = surahID;
    }

    public int getAyahNo() {
        return AyahNo;
    }

    public void setAyahNo(int ayahNo) {
        AyahNo = ayahNo;
    }

    public String getArabicText() {
        return ArabicText;
    }

    public void setArabicText(String arabicText) {
        ArabicText = arabicText;
    }

    public String getFatehMuhammadJaland() {
        return FatehMuhammadJaland;
    }

    public void setFatehMuhammadJaland(String fatehMuhammadJaland) {
        FatehMuhammadJaland = fatehMuhammadJaland;
    }

    public String getMehmoodulHassan() {
        return MehmoodulHassan;
    }

    public void setMehmoodulHassan(String mehmoodulHassan) {
        MehmoodulHassan = mehmoodulHassan;
    }

    public String getDrMohsinKhan() {
        return DrMohsinKhan;
    }

    public void setDrMohsinKhan(String drMohsinKhan) {
        DrMohsinKhan = drMohsinKhan;
    }

    public String getMuftitakiUsmani() {
        return MuftitakiUsmani;
    }

    public void setMuftitakiUsmani(String muftitakiUsmani) {
        MuftitakiUsmani = muftitakiUsmani;
    }

    public int getRukuID() {
        return RukuID;
    }

    public void setRukuID(int rukuID) {
        RukuID = rukuID;
    }

    public int getPRakuID() {
        return PRakuID;
    }

    public void setPRakuID(int PRakuID) {
        this.PRakuID = PRakuID;
    }

    public int getParaID() {
        return ParaID;
    }

    public void setParaID(int paraID) {
        ParaID = paraID;
    }

    public tayah(int ayaID, int surahID, int ayahNo, String arabicText, String fatehMuhammadJaland, String mehmoodulHassan, String drMohsinKhan, String muftitakiUsmani, int rukuID, int PRakuID, int paraID) {
        AyaID = ayaID;
        SurahID = surahID;
        AyahNo = ayahNo;
        ArabicText = arabicText;
        FatehMuhammadJaland = fatehMuhammadJaland;
        MehmoodulHassan = mehmoodulHassan;
        DrMohsinKhan = drMohsinKhan;
        MuftitakiUsmani = muftitakiUsmani;
        RukuID = rukuID;
        this.PRakuID = PRakuID;
        ParaID = paraID;
    }

    @Override
    public String toString() {
        return "tayah{" +
                "AyaID=" + AyaID +
                ", SurahID=" + SurahID +
                ", AyahNo=" + AyahNo +
                ", ArabicText='" + ArabicText + '\'' +
                ", FatehMuhammadJaland='" + FatehMuhammadJaland + '\'' +
                ", MehmoodulHassan='" + MehmoodulHassan + '\'' +
                ", DrMohsinKhan='" + DrMohsinKhan + '\'' +
                ", MuftitakiUsmani='" + MuftitakiUsmani + '\'' +
                ", RukuID=" + RukuID +
                ", PRakuID=" + PRakuID +
                ", ParaID=" + ParaID +
                '}';
    }
}
