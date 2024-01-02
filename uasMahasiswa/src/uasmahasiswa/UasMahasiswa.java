/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uasmahasiswa;

/**
 * Nama         : Ahmad Nurfaqih
 * Nim          : 22205015
 * prodi        : Teknik Informatia
 * Deskripsi    : Mahasiswa
 */


import java.util.Scanner;

class Mahasiswa {

    private int nim;
    private String nama;
    private int umur;

    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}

class MahasiswaBaru extends Mahasiswa {

    private int nim;

    public MahasiswaBaru(String nama, int umur, int nim) {
        super(nama, umur);
        this.nim = nim;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIM: " + nim);
    }
}

class MahasiswaLama extends Mahasiswa {

    private int angkatan;

    public MahasiswaLama(String nama, int umur, int angkatan) {
        super(nama, umur);
        this.angkatan = angkatan;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Angkatan: " + angkatan);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("MAHASISWA");
        System.out.println("--------------");

        // Create new student objects
        System.out.print("Masukkan nama mahasiswa baru: ");
        String namaBaru = input.nextLine();
        System.out.print("Masukkan umur mahasiswa baru: ");
        int umurBaru = input.nextInt();
        input.nextLine(); // Consume the newline character

        System.out.print("Masukkan NIM mahasiswa baru: ");
        int nimBaru = input.nextInt();
        input.nextLine(); // Consume the newline character
        MahasiswaBaru mahasiswaBaru1 = new MahasiswaBaru(namaBaru, umurBaru, nimBaru);

        System.out.print("\nMasukkan nama mahasiswa lama: ");
        String namaLama = input.nextLine();
        System.out.print("Masukkan umur mahasiswa lama: ");
        int umurLama = input.nextInt();
        input.nextLine(); // Consume the newline character

        System.out.print("Masukkan angkatan mahasiswa lama: ");
        int angkatanLama = input.nextInt();
        input.nextLine(); // Consume the newline character
        MahasiswaLama mahasiswaLama1 = new MahasiswaLama(namaLama, umurLama, angkatanLama);
        
        
        System.out.println("\nHASIL");

        // Display information for each student
        System.out.println("Mahasiswa Baru:");
        mahasiswaBaru1.displayInfo();

        System.out.println("\nMahasiswa Lama:");
        mahasiswaLama1.displayInfo();

        // Additional examples - accessing specific attributes
        int nimBaru2 = mahasiswaBaru1.getNim();
        int angkatanLama2 = mahasiswaLama1.getAngkatan();

        System.out.println("\nNIM Mahasiswa Baru 1: " + nimBaru2);
        System.out.println("Angkatan Mahasiswa Lama 1: " + angkatanLama2);
    }
}

