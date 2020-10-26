package ImageHoster.controller;

import ImageHoster.model.Image;
import ImageHoster.service.ImageService;
import ImageHoster.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ImageService imageService;

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String getAllImages(Model model) {

        List<Image> images = imageService.getAllImages();
        model.addAttribute("images", images);
        return "index";
    }
}