public class percabangan { public static void main(String[] args) {
    int nilai;
    nilai = 77 ;
    String index;

    if(nilai >= 91 && nilai <= 100)
    index = "A+";

    else if (nilai >= 85 && nilai <= 90)
    index = "A-";

    else if (nilai >= 81 && nilai <= 85)
    index = "B+";

    else if (nilai >= 76 && nilai <= 80)
    index = "B-";

    else if (nilai >= 65 && nilai <= 70)
    index = "C+";

    else if (nilai >= 61 && nilai <= 65)
    index = "C";

    else if (nilai >= 56 && nilai <= 60)
    index = "C-";

    else if (nilai >= 0 && nilai <= 55)
    index = "F";

    else
    index = "TIDAK LULUS";

    System.out.println("Nilai " + nilai + " Mempunyai index " + index);
}
    
}
