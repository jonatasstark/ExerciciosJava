package JavaMatematica;

public class VolumePiramide { // Pirâmide Base Quadrada
    public static void main(String[] args) {
        int ladoBase = 6;//variavel que declara o lado da base de uma piramide de base quadrada
        int altura = 8;//variavel que declara a altura

        double areaBase = ladoBase * ladoBase;//variavel que calcula a area do retangulo

        double volume = areaBase * altura / 3;//variavel que calcula o volume da piramide

        System.out.println("Pirâmide de base quadrada:");
        System.out.println("Volume: " + volume + " Área: " + areaBase);
    }
}
