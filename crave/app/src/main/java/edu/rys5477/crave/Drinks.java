package edu.rys5477.crave;

public class Drinks {
    private String name;
    private String desc;
    private int imageID;

    public static final Drinks[] drinks={

            new Drinks("CHOCOLATE FRAPPE","this is a description fore CHOCOLATE FRAPPE",R.drawable.chocolate),
            new Drinks("VANILLA FRAPPE","this is a description fore VANILLA FRAPPE ",R.drawable.vanilla),
            new Drinks("CARAMEL FRAPPE","this is a description fore CARAMEL FRAPPE FRAPPE ",R.drawable.caramel),
            new Drinks("TEA FRAPPE","this is a description fore TEA FRAPPE ",R.drawable.tea),
            new Drinks("STRAWBERRY FRAPPE","this is a description fore STRAWBERRY FRAPPE ",R.drawable.strawberry),
            new Drinks("FRAPUCCINO COFFEE","this is a description fore FRAPUCCINO COFFEE ",R.drawable.frapuccino),





    };



    private Drinks(String name, String desc, int imageID){

        this.name=name;
        this.desc=desc;
        this.imageID=imageID;
    }


    public String getName() {
        return name;

    }
    public String getDesc(){
        return desc;
    }
    public int getImageID(){
        return imageID;
    }


    public String toString()
    {
        return this.name;
    }


}

