package Practicum.Sprint11.ServiceLocation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NavigatorScreen {
    MapService mapService;
    LocationService locationService;


    @Autowired
    public NavigatorScreen(
            MapService mapService,
            LocationService locationService) {

        this.mapService = mapService;
        this.locationService = locationService;
    }

}