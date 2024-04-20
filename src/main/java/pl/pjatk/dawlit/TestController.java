package pl.pjatk.dawlit;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/exception")
    public Boolean exception(){
        throw new RuntimeException("stuff");
    }

    @GetMapping("/hello")
    public ResponseEntity<String> helloParam(@RequestParam String reqParam){
        return ResponseEntity.ok(reqParam);
    }
    /*@GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello world");
    }*/

    @GetMapping("/model")
    public ResponseEntity<Car> model(){
        return new ResponseEntity<>(new Car(), HttpStatus.OK);
    }

    @PostMapping("/model")
    public ResponseEntity<Car> modelPost(@RequestBody Car car){
    return new ResponseEntity<>(car, HttpStatus.OK);
    }

    @GetMapping("/hello/{someValue}")
    public ResponseEntity<String> helloValue(@PathVariable String someValue){
        return ResponseEntity.ok(someValue);
    }
}
