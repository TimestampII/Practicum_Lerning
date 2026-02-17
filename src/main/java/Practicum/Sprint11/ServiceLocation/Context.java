package Practicum.Sprint11.ServiceLocation;

public class Context {
    static MapService MAP_SERVICE = new SomeMapService();
    static LocationService LOCATION_SERVICE = new GpsService();
}

public class NavigatorScreen {
    MapService mapService;
    LocationService locationService;
    int zoomLevel;

    public NavigatorScreen() {
        // используем зависимости
        this.mapService = Context.MAP_SERVICE;
        this.locationService = Context.LOCATION_SERVICE;
        this.zoomLevel = 5;
    }

    public void updateScreen() {
        Coordinates coordinates =
                locationService.getCoordinates();
        MapData map = mapService.getMap(coordinates, zoomLevel);

        // дальше: вывести карту на экран
    }
}