package com.scar.sepatufutsal;

import java.util.ArrayList;

public class SepatuData {
    public static String [][] data = new String[][]{
            {"Sepatu Futsal Specs Accelerator Garuda Attack IN - White/Emperor Red", "Specs", "Rp.599,800", "https://media.sportaways.com/media/catalog/product/cache/1/image/600x600/9df78eab33525d08d6e5fb8d27136e95/s/p/specs-accelerator_garuda_attack_in_white-emperor_red-black_-1-min.jpg", "Hallo Team Sporty, Persembahan Special dari \"Specs Accelerator Garuda Attack IN\" Generasi ke 5 dari seri Accelerator Garuda Attack, sepatu yang terinspirasi dari perjuangan rakyat Indonesia untuk mencapai Kemerdekaan. Dapatkan sekarang juga! "},
            {"Sepatu Futsal Specs Accelerator Lightspeed Reborn IN - Green/Gold", "Specs", "Rp.439,00", "https://media.sportaways.com/media/catalog/product/cache/1/image/600x600/9df78eab33525d08d6e5fb8d27136e95/s/p/specs_acc_light_speed_reborn_in_artilery_green_gold_-_1-min.jpg", "Hallo Team Sporty, Saat ini futsal sedang berkembang loh, banyak pemain muda yang berbakat. Tapi dibalik permainan bagus mereka ada sepatu yang mendukung performancenya juga loh. \"Specs Accelerator Lightspeed Reborn IN\" ini adalah salah satu solusi yang mendukung kalian saat bermain dilapangan."},
            {"Sepatu Futsal Specs Stardust 19 IN - Silver/Emperor Red/Black", "Specs", "Rp.319,000", "https://media.sportaways.com/media/catalog/product/cache/1/image/600x600/9df78eab33525d08d6e5fb8d27136e95/s/p/specs-stardust_19_in_silver-emperor_red-black_-1-min.jpg", "Hallo Team Sporty, Saat ini futsal sedang berkembang loh, banyak pemain muda yang berbakat. Tapi dibalik permainan bagus mereka ada sepatu yang mendukung performancenya juga loh. \"Specs Stardust 19 IN\" ini adalah salah satu solusi yang mendukung kalian saat bermain dilapangan."},
            {"Sepatu Futsal Specs Swervo Mojave 19 IN - Cool Grey/Yellow", "Specs", "Rp.345,000", "https://media.sportaways.com/media/catalog/product/cache/1/image/600x600/9df78eab33525d08d6e5fb8d27136e95/s/p/specs-swervo_mojave_19_in_cool_grey-safety_yellow_-1-min.jpg", "Hallo Team sporty, Saat ini futsal sedang berkembang loh, banyak pemain muda yang berbakat, dibalik permainan bagus mereka ada sepatu yang mendukung performancenya juga loh. \"Specs Swervo Mojave 19 IN\" ini adalah salah satu solusi yang mendukung kalian saat bermain dilapangan."},
            {"Sepatu Futsal Specs Viento 19 IN - Black/Emperor Red/Silver", "Specs", "Rp.215,000", "https://media.sportaways.com/media/catalog/product/cache/1/image/600x600/9df78eab33525d08d6e5fb8d27136e95/s/p/specs-viento_19_in_black-emperor_red-silver_-1-min.jpg", "Hallo Team Sporty, Saat ini futsal sedang berkembang loh, banyak pemain muda yang berbakat. Tapi dibalik permainan bagus mereka ada sepatu yang mendukung performancenya juga loh. \"Specs Viento 19 IN\" ini adalah salah satu solusi yang mendukung kalian saat bermain dilapangan."}
    };

    public  static ArrayList<Sepatu> getListData(){
        ArrayList<Sepatu> list = new ArrayList<>();
        for (String[] aData : data){
            Sepatu sepatu= new Sepatu();
            sepatu.setName(aData[0]);
            sepatu.setBrand(aData[1]);
            sepatu.setHarga(aData[2]);
            sepatu.setPhoto(aData[3]);
            sepatu.setDeskripsi(aData[4]);
            list.add(sepatu);
        }
        return list;
    }
}
