package Classes;

public class Image {

    String img;

    public void PrintAst(){
        if (img!=null)
        {
            System.out.println(img);
        }


    }
    @Override
    public String toString() {
        return
                "imageUrl:'" + +'"'+img+'"'+',' ;

    }
    public void setImg(String img) {
        this.img = img;
    }

    public String getImg() {
        return img;
    }
}
