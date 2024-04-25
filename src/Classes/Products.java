package Classes;

public class Products {

String IDENTIFIER;
Id id1;
Name namee;
Price pricee;
Descreption descriptionn;
Image imagee;

    public void PrintAst(){
        if(IDENTIFIER!=null)
        {
            System.out.println(IDENTIFIER);
        }
        if(id1!=null)
        {
            id1.PrintAst();
        }
        if(namee!=null)
        {
            namee.PrintAst();
        }
        if(pricee!=null)
        {
            pricee.PrintAst();
        }
        if(descriptionn!=null)
        {
            descriptionn.PrintAst();
        }
        if(imagee!=null)
        {
            imagee.PrintAst();
        }
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public void setId1(Id id1) {
        this.id1 = id1;
    }

    public void setNamee(Name namee) {
        this.namee = namee;
    }

    public void setPricee(Price pricee) {
        this.pricee = pricee;
    }

    public void setDescriptionn(Descreption descriptionn) {
        this.descriptionn = descriptionn;
    }

    public void setImagee(Image imagee) {
        this.imagee = imagee;
    }

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public Id getId1() {
        return id1;
    }

    public Name getNamee() {
        return namee;
    }

    public Price getPricee() {
        return pricee;
    }

    public Descreption getDescriptionn() {
        return descriptionn;
    }

    public Image getImagee() {
        return imagee;
    }
}
