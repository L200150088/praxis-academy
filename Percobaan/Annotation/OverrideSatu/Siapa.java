package OverrideSatu;

class Siapa extends Nama{
    @Override
    public void Sapa(){
        System.out.println("hallo Siapa");
    }

    public static void main(String[] args){
        Siapa ss = new Siapa();
        Nama nn = new Nama();

        ss.Sapa();
        nn.Sapa();
    }
}