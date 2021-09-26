/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario_automoviles;

import java.util.Scanner;

/**
 *
 * @author victo
 */
class codigo {
            
         
    public void iniciar(){
        int opcion1;
        do{
    Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println("---Concesionario Automoviles---");
        System.out.println("-------------------------------");
        System.out.println("1. Seleccionar automovil");
        System.out.println("2. Salir");

        System.out.println("Ingrese la opción que desee ejecutar: ");
        opcion1=sc.nextInt();
          
        while (opcion1 == 1){
            seleccion();
        }
        
    }while(opcion1!=2);
                
    } 
    
     public void seleccion(){
      Scanner entrada = new Scanner(System.in);

    String opcion2;
        System.out.println("------------------------------");
        System.out.println("Selección de Gama de vehículos");
        System.out.println("------------------------------");
          
                System.out.println("1. Sedán Económico");
                System.out.println("2. Sedán");
                System.out.println("3. Deportivo");
                System.out.println("4. Híbrido");
                System.out.println("5. Coupe");
                System.out.println("6. Coupe Deportivo");
                System.out.println("7. Compacto");
                System.out.println("8. Hatchback");
                System.out.println("9. Económico versión Rally");
                System.out.println("10. Regresar al menú principal");
                
                System.out.println("Escriba la gama del vehiculo: ");
          opcion2 = entrada.nextLine();
          switch (opcion2){
              case "sedan economico":
                  System.out.println("Ha seleccionado Sedán Económico");
                  amenidad(opcion2);
               break;
              case "sedan": 
                  System.out.println("Ha seleccionado Sedán");
                  amenidad(opcion2);
               break;
              case "deportivo":
                  System.out.println("Ha seleccionado Deportivo");
                  amenidad(opcion2);
                   break;
              case "hibrido":
                   System.out.println("Ha seleccionado Híbrido");
                   amenidad(opcion2);
                   break;
              case "coupe":
                  System.out.println("Ha seleccionado Coupe");
                  amenidad(opcion2);
                   break;
              case "coupe deportivo" :
                  System.out.println("Ha seleccionado Coupe Deportivo");
                  amenidad(opcion2);
              case "compacto":
                 System.out.println("Ha seleccionado Compacto");
                 amenidad(opcion2);
                   break;
              case "hatchback":
                 System.out.println("Ha seleccionado Hatchback");
                 amenidad(opcion2);
                   break;
              case "economico version rally":
                 System.out.println("Ha seleccionado Económico versión Rally");
                 amenidad(opcion2);
                   break;
              case "regresar":  
                  while ("regresar".equals(opcion2)){
                      iniciar();
                  }
              default:
        System.out.println(opcion2);
        amenidad(opcion2);
        break;
        }
          }
     
     
    public void amenidad(String opcion2){
      Scanner red = new Scanner(System.in);
      int opcioname;
      
        System.out.println("--------------------------");
        System.out.println("¿Desea agregar amenidades?");
        System.out.println("--------------------------");
        System.out.println("1.si");
        System.out.println("2.no");
        System.out.println("Ingrese el número que desee ejecutar: ");

         opcioname = red.nextInt();
     
       while (opcioname == 1){
           gamadeportiva();           
        }
       while (opcioname == 2){
           System.out.println("La gama es:" + opcion2);
           
           
           System.out.println("Amenidades: Ninguna");
           
           String total = null;
           
           if("sedan economico".equals(opcion2)){
               
                   System.out.println("El total es: $18,940.00");
               
           }
           if("sedan".equals(opcion2)){
               
                   System.out.println("El total es: $23,570.00");
               
           }
           if("deportivo".equals(opcion2)){
               
                   System.out.println("El total es: $24,100.00");
               
           }
           if("hibrido".equals(opcion2)){
               
                   System.out.println("El total es: $25,100.00");
               
           }
           if("coupe".equals(opcion2)){
               
                   System.out.println("El total es: $19,350.00");
               
           }
           if("coupe deportivo".equals(opcion2)){
               
                   System.out.println("El total es: $24,100.00");
               
           }
           if("compacto".equals(opcion2)){
               
                   System.out.println("El total es: $16,190.00");
               
           }
           if("hatchback".equals(opcion2)){
               
                   System.out.println("El total es: $20,150.00");
               
           }
           if("economico version rally".equals(opcion2)){
               
                   System.out.println("El total es: $34,700.00");
               
           }
           
           
           int pop;
           System.out.println("--------------------------");
           System.out.println("Regreso a menu principal");
           System.out.println("--------------------------");
           System.out.println("escriba 1 para regresar a menu principal ");
           pop = red.nextInt();
           while (pop==1){
               iniciar();
           }
           
}

}
    
    
    public void gamadeportiva(){
        Scanner rad = new Scanner(System.in);
        
        String opcion3;
                System.out.println("-------------------");
                System.out.println("Tipos de amenidades");
                System.out.println("-------------------");
                System.out.println("1. Tipo de transmisión");
                System.out.println("2. Color de pintura");
                System.out.println("3. Aros");
                System.out.println("4. Accesorios exteriores");
                System.out.println("5. Accesorios interiores");
                System.out.println("6. Accesorios electrónicos");
                System.out.println("7. Color de tapiceria");
                System.out.println("8. Regresar a selección de gama de vehículos");
               
                System.out.println("Escriba el tipo de amenidad: ");
                opcion3 = rad.nextLine();
               
                    switch (opcion3){
              case "tipo de transmision":
                  System.out.println("Ha seleccionado tipo de transmisión");
                  tipotransmision();
               break; 
          
              case "color de pintura": 
                  System.out.println("Ha seleccionado color de pintura");
                  colordepintura();
               break;
              case "aros":
                  System.out.println("Ha seleccionado aros");
                  aro();
                   break;
              case "accesorios exteriores":
                   System.out.println("Ha seleccionado accesorios exteriores");
                   accesoriosex();
                   break;
              case "accesorios interiores":
                  System.out.println("Ha seleccionado accesorios interiores");
                   accesoriosinte();
                   break;
              case "accesorios electricos":
                  System.out.println("Ha seleccionado accesorios electrónicos");
                   accesoriosele();
                  break;
              case "color de tapiceria":
                  System.out.println("Ha seleccionado tipo de tapiceria");
                  tapiceria();
                  break;
              case "regresar":
                  while ("regresar".equals(opcion3)){
                      seleccion();
        }
          }        
    }
    
    public void tipotransmision(){
        Scanner tras = new Scanner(System.in);
        
        String opcion2 = null;
        
        String transmision;
        System.out.println("-------------------");
        System.out.println("Tipo de transmisión");
        System.out.println("-------------------");
                System.out.println("1. Manual-------------------$0.00");
                System.out.println("2. CVT----------------------$800.00");
                System.out.println("3. Manual con turbo---------$0.00");
                System.out.println("4. CVT con turbo------------$800.00");
                System.out.println("5. Regresar a seleccion de amenidades");
               
                System.out.println("Escriba el tipo de transmision: ");
                transmision = tras.nextLine();
               
                    switch (transmision){
              case "manual":
                  System.out.println("Ha seleccionado manual");
               break;
              case "cvt": 
                  System.out.println("Ha seleccionado cvt");
               break;
              case "manual con turbo":
                  System.out.println("Ha seleccionado aros");
                   break;
              case "cvt con turbo":
                   System.out.println("Ha seleccionado regresar a seleccion de amenidades");
                   break;
              case "regresar":
                  while ("regresar".equals(transmision)){
                      amenidad(opcion2);
        }
          }
    }
    
    public void colordepintura(){
        Scanner colorscr = new Scanner(System.in);
        
        String opcion2 = null;
        String color;

                System.out.println("Color de pintura exterior");
                System.out.println("1. Cosmic Blue");
                System.out.println("2. Burgundy Night");
                System.out.println("3. Rallye Red");
                System.out.println("4. Crystal Black");
                System.out.println("5. Modern Steel");
                System.out.println("6. Taffeta White");
                System.out.println("7. Energy Green");
                System.out.println("8. Kona Coffee");
                System.out.println("9. Orange Fury");
                System.out.println("10. Helios Yellow ");
		System.out.println("11. Sonic Gray");
		System.out.println("12. Polished Metal");
		System.out.println("13. Regresar a selección de tipos de amenidades");
                
                System.out.println("Ingrese color de pintura exterior: ");

                color = colorscr.nextLine();
               
                    switch (color){
              case "cosmic blue":
                  System.out.println("Ha seleccionado color cosmic blue");
               break;

              case "burgundy night": 
                  System.out.println("Ha seleccionado color burgundy night");
               break;

              case "rallye Red":
                  System.out.println("Ha seleccionado color rallye red");
                   break;

              case "crystal black":
                   System.out.println("Ha seleccionado color crystal black");
                   break;

              case "modern stleel":
                   System.out.println("Ha seleccionado color modern stleel");
                   break;

              case "taffeta white":
                   System.out.println("Ha seleccionado color taffeta white");
                   break;

              case "energy green":
                   System.out.println("Ha seleccionado color energy green");
                   break;
              
              case "kona coffee":
                   System.out.println("Ha seleccionado color kona coffee");
                   break;
              
              case "orange fury":
                   System.out.println("Ha seleccionado color orange fury");
                   break;

              case "hellos yellow":
                   System.out.println("Ha seleccionado color hellos yellow");
                   break;

              case "sonic gray":
                   System.out.println("Ha seleccionado color sonic gray");
                   break;
              
              case "polished metal":
                   System.out.println("Ha seleccionado color polished metal");
                   break;

              case "regresar":
                  while ("regresar".equals(color)){
                      amenidad(opcion2);
        }
          }
    }
    
    public void tapiceria(){
        Scanner colortab = new Scanner(System.in);
        
        String opcion2 = null;
        String colortap;

                System.out.println("Color de Tapicería");
                System.out.println("1. Gray Cloth");
                System.out.println("2. Black Cloth");
                System.out.println("3. Black/Gray Cloth");
                System.out.println("4. Red/Black Suede Effect-Fabric");
                System.out.println("5. Regresar a selección de tipos de amenidades");
               
                System.out.println("Ingrese el color de tapicería: ");

                colortap = colortab.nextLine();

              switch (colortap){

              case "gray cloth":
                  System.out.println("Ha seleccionado manual");
               break;

              case "black cloth": 
                  System.out.println("Ha seleccionado cvt");
               break;

              case "black/gray cloth":
                  System.out.println("Ha seleccionado aros");
                   break;

              case "red/black suede effect fabric":
                   System.out.println("Ha seleccionado regresar a seleccion de amenidades");
                   break;

              case "regresar":
                  while ("regresar".equals(colortap)){
                      amenidad(opcion2);
        }
          }
    }
    
    public void aro(){
        Scanner taros = new Scanner(System.in);
        
        String opcion2 = null;
        String aro;

                System.out.println("Tipo de Aros");
                System.out.println("1. 15 ");
                System.out.println("2. 16 ");
                System.out.println("3. 17------------------$1,688.00");
                System.out.println("4. 18------------------$1,700.00");
                System.out.println("5. 19------------------$3,011.00");
                System.out.println("6. Regresar a selección de tipos de amenidades");
               
                System.out.println("Ingrese el tipo de Aros: ");


                aro = taros.nextLine();

              switch (aro){

              case "15":
                  System.out.println("Ha seleccionado tamaño de aros 15");
               break;

              case "16": 
                  System.out.println("Ha seleccionado tamaño de aros 16");
               break;

              case "17":
                  System.out.println("Ha seleccionado tamaño de aros 17");
                   break;

              case "18":
                   System.out.println("Ha seleccionado tamaño de aros 18");
                   break;

              case "19": 
                   System.out.println("HHa seleccionado tamaño de aros 19");
                   break;
              case "regresar":
                  while ("regresar".equals(aro)){
                      amenidad(opcion2);
        }
          }
    }
    
    public void accesoriosex(){
        Scanner acc = new Scanner(System.in);
        
        String opcion2 = null;
        String accesoriox;

                System.out.println("Accesorios exteriores");
                System.out.println("1. Body Side Molding--------------$217.00");
                System.out.println("2. Car Cover----------------------$230.00");
                System.out.println("3. Decklid Spoiler----------------$299.99");
                System.out.println("4. Door Edge Film-----------------$42.00");
                System.out.println("5. Door Edge Guards---------------$84.00");
                System.out.println("6. Door Trim Chrome---------------$285.00");
                System.out.println("7. Door Visor---------------------$185.00");
                System.out.println("8. Front Fender Emblems-----------$50.00");
                System.out.println("9. Rear Bumper Applique-----------$70.00");
                System.out.println("10. Fog Lights--------------------$325.00");
		System.out.println("11. Nose Mascs--------------------$158.00");
		System.out.println("12. Moonrof Visor-----------------$138.00");
                System.out.println("13. Splash Guard Set--------------$104.00");
                System.out.println("14. Dust Cover--------------------$350.00");
		System.out.println("15. Door Mirror Cover - Carbon Fiber-------------$520.00");
		System.out.println("16. Regresar a selección de tipos de amenidades");
                
                System.out.println("Ingrese tipo de accesorios exteriores: ");

                accesoriox = acc.nextLine();

  switch (accesoriox){

              case "body side molding":
                  System.out.println("Ha seleccionado el accesorio body side molding");
               break;

              case "car cover": 
                  System.out.println("Ha seleccionado el accesorio car cover");
               break;

              case "decklid spoiler":
                  System.out.println("Ha seleccionado el accesorio decklid spoiler");
                   break;

              case "door edge film":
                   System.out.println("Ha seleccionado el accesorio door edge film");
                   break;

              case "door edge guards":
                   System.out.println("Ha seleccionado el accesorio door edge guards");
                   break;

              case "door trim chrome":
                   System.out.println("Ha seleccionado el accesorio door trim chrome");
                   break;

              case "door visor":
                   System.out.println("Ha seleccionado el accesorio door visor");
                   break;
              
              case "front fender emblems":
                   System.out.println("Ha seleccionado el accesorio front fender emblems");
                   break;
              
              case "rear bumper applique":
                   System.out.println("Ha seleccionado el accesorio rear bumper applique");
                   break;

              case "fog lights":
                   System.out.println("Ha seleccionado el accesorio fog lights");
                   break;

              case "nose mascs":
                   System.out.println("Ha seleccionado el accesorio nose mascs");
                   break;
              
              case "moonrof visor":
                   System.out.println("Ha seleccionado el accesorio moonrof visor");
                   break;

              case "splash guard set":
                   System.out.println("Ha seleccionado el accesorio psplash guard set");
                   break;

              case "dust cover":
                   System.out.println("Ha seleccionado el accesorio dust cover");
                   break;

              case "door mirror cover - carbon fiber":
                   System.out.println("Ha seleccionado el accesorio door mirror cover - carbon fiber");
                   break;

              case "regresar":
                  while ("regresar".equals(accesoriox)){
                      amenidad(opcion2);
        }
          }
    }
    
    public void accesoriosinte(){
     
Scanner p = new Scanner(System.in);
        
        String opcion2 = null;
        String accesorioin;                
        
                System.out.println("Accesorios interiores");
                System.out.println("1. All-Seasons Floor Mats---------------$142.00");
                System.out.println("2. Automatic-Dimming Mirror-------------$219.00");
                System.out.println("3. Cargo Hook---------------------------$12.00");
                System.out.println("4. Cargo Net----------------------------$49.00");
                System.out.println("5. Console Illumination-----------------$250.00");
                System.out.println("6. Cargo Organizer----------------------$87.00");
                System.out.println("7. Door Panel Protector-----------------$149.00");
                System.out.println("8. Armrest Compartiment-----------------$337.00");
                System.out.println("9. Door Sill Trim-Illuminated-----------$290.00");
                System.out.println("10. Cargo Cover-------------------------$166.00");
		System.out.println("11. Cargo Liner-------------------------$187.00");
		System.out.println("12. Regresar a selección de tipos de amenidades");
                
                System.out.println("Ingrese tipo de accesorios interiores: ");

                accesorioin = p.nextLine();

 switch (accesorioin){

              case "all-seasons floor mats":
                  System.out.println("Ha seleccionado el accesorio all-seasons floor mats");
               break;

              case "automatic-dimming mirror": 
                  System.out.println("Ha seleccionado el accesorio automatic-dimming mirror");
               break;

              case "cargo hook":
                  System.out.println("Ha seleccionado el accesorio cargo hook");
                   break;

              case "cargo net":
                   System.out.println("Ha seleccionado el accesorio cargo net");
                   break;

              case "console illumination":
                   System.out.println("Ha seleccionado el accesorio console illumination");
                   break;

              case "cargo organizer":
                   System.out.println("Ha seleccionado el accesorio cargo organizer");
                   break;

              case "door panel protector":
                   System.out.println("Ha seleccionado el accesorio door panel protector");
                   break;
              
              case "armrest compartiment":
                   System.out.println("Ha seleccionado el accesorio armrest compartiment");
                   break;
              
              case "door sill trim-illuminated":
                   System.out.println("Ha seleccionado el accesorio door sill trim-illuminated");
                   break;

              case "cargo cover":
                   System.out.println("Ha seleccionado el accesorio cargo cover");
                   break;

              case "cargo liner":
                   System.out.println("Ha seleccionado el accesorio cargo liner");
                   break;
             
              case "regresar":
                  while ("regresar".equals(accesorioin)){
                      amenidad(opcion2);
        }
          }   
    }
    
    public void accesoriosele(){
        Scanner a = new Scanner(System.in);
        
        String opcion2 = null;
        String accesorioen;                


                System.out.println("Accesorios Electrónicos");
                System.out.println("1. Wireless Phone Charger------------$305.00");
                System.out.println("2. USB Charger - 2.1 Amp-------------$120.00");
                System.out.println("3. Puddle Light----------------------$185.00");
                System.out.println("4. Parking Sensors-------------------$514.00");
                System.out.println("5. Regresar a selección de amenidades");
                
                System.out.println("Ingrese el tipo de accesorio electrónico: ");
                
                accesorioen = a.nextLine();

              switch (accesorioen){
              case "wireless phone charger":
                  System.out.println("Ha seleccionado accesorio wireless phone charger");
               break;
              case "usb charger - 2.1 amp": 
                  System.out.println("Ha seleccionado accesorio usb charger - 2.1 amp");
               break;

              case "puddle light":
                  System.out.println("Ha seleccionado accesorio puddle light");
                   break;

              case "parking sensors":
                   System.out.println("Ha seleccionado accesorio parking sensors");
                   break;

              case "regresar":
                  while ("regresar".equals(accesorioen)){
                      amenidad(opcion2);
        }
          }
    }
}



    

    
       
