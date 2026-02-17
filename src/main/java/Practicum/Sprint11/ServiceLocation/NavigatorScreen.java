package Practicum.Sprint11.ServiceLocation;


public class NavigatorScreen {
    MapService mapService;
    LocationService locationService;
    int zoomLevel;

    // зависимости — параметры конструктора
    public NavigatorScreen(MapService mapService, LocationService locationService) {
        this.mapService = mapService;
        this.locationService = locationService;
        this.zoomLevel = 5;
    }

    public void updateScreen() {
        Coordinates coordinates =
                locationService.getCoordinates();
        MapData map = mapService.getMap(coordinates, zoomLevel);

        // дальше: вывести карту на экран
    }
}