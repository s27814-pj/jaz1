package pl.pjatk.dawlit;

import org.apache.coyote.Response;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class FromHomeController {

    @GetMapping({"/here{any}", "/here"})
    public ResponseEntity<String> hello(@PathVariable(required = false) String any, @RequestParam(required = false) String reqParam){
        if (any!=null) return ResponseEntity.ok(any);
        if (reqParam!=null) return ResponseEntity.ok(reqParam);
        return ResponseEntity.ok("Hello world");
    }

    @PutMapping("/put/{name}")
    public ResponseEntity<Car> putterCar(@PathVariable(required = true) String name, @RequestBody Car car){
        Car car1 = new Car(car.getMakeYear(), name, car.getaBoolean());
        return new ResponseEntity<>(car1, HttpStatus.OK);
    }

    @PostMapping("/post")
    public ResponseEntity<Car> posterCar(@RequestBody Car car){
        return new ResponseEntity<>(car, HttpStatus.OK);
    }
    @DeleteMapping({"/delete/{any}", "/delete{any}"})
        public HttpStatus delete(@PathVariable(required = false) String any){
            return HttpStatus.OK;
        }



}
