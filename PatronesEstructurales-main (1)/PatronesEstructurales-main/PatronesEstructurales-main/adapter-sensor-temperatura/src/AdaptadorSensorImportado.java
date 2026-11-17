public class AdaptadorSensorImportado implements SensorTemperatura {
private SensorImportado sensor;


public AdaptadorSensorImportado(SensorImportado sensor) {
        this.sensor = sensor;
}

@Override
public String getNombre(){
    return sensor.getModelo();

}
@Override
public String leerCelsius(){
    return (sensor.readFarenheit()-32)*5/9;
}
    
