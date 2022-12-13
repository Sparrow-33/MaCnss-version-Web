package com.macnss.controllers;


import com.macnss.services.DossierService;
import com.macnss.services.VisiteService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/dossier")
public class DossierController {

    private int id;

    final DossierService dossierService;
    final VisiteService visiteService;

    public DossierController(DossierService dossierService, VisiteService visiteService) {
        this.dossierService = dossierService;
        this.visiteService = visiteService;
    }

    @PostMapping("/createDossier")
    public ModelAndView saveDossier(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView("agent/dashboard");
        String matricule = request.getParameter("matricule");
//         String matricule = "6fa29f59-044a-48b6-82c6-4155582bdc6a";
        id = dossierService.createNewDossier(matricule).getId();
        mv.getModel().put("consultation", true);
        mv.getModel().put("patient", false);
        return mv;
     }

    @PostMapping("/newVisite")
    public ModelAndView saveVisite(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView("agent/dashboard");
        Double tarif = Double.valueOf(request.getParameter("tarif"));
        Integer code = Integer.valueOf(request.getParameter("code"));
        visiteService.NewVisite(id, tarif, code);
//
        mv.getModel().put("consultation", false);
        mv.getModel().put("patient", false);
        mv.getModel().put("medicament", true);
        return mv;
    }

    @PostMapping("/medicament")
    public ModelAndView saveMedicament(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView("agent/dashboard");

        return mv;
    }


}
