package com.practapp_3.springPractApp3.run;

import javax.xml.stream.Location;
import java.time.LocalDateTime;

// the good thing that we have the run in this class as a record and not th using the RUN_the_normal_way class its because
// this class is immutable and there is not constrictor here and there is basically all arcs constroctor.
// we create and instance of a run and we can get the values but we can not set them. or change them later, so this class is immutable.
public record Run(Integer id,
                  String title,
                  LocalDateTime startedOn,
                  LocalDateTime compledOn,
                  Integer miles,
                  Location location
                  ) {

}
