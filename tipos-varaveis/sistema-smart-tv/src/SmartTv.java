public class SmartTv {
 boolean ligada=false;
 int canal=1;
 int volume=25;

 public void mudarCanal (int novoCanal) {
    canal = novoCanal;
 }

 public void subirCanal() {
    canal++;
 }

 public void descerCanal() {
    canal--;
 }

 public void aumentarVolume(){
    volume = volume + 1;
    volume++;

}

public void diminuirVolume(){
    volume = volume - 1;
    volume--;

}

public void ligar() {
     ligada=true;
    
 }

public void desligar() {
     ligada=false;
    
}

}