package lab.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lab.model.Flower;

@RequestMapping("/flowers")
@RestController
public class FlowerController {
    private List<Flower> listFlower = new ArrayList<>();

    @GetMapping()
    public List<Flower> getFlowers() {
        return listFlower;
    }
}
