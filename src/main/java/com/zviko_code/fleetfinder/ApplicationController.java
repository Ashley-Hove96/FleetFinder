package com.zviko_code.fleetfinder;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
	@GetMapping("/index")
	public String Dashboard() { return "index.html";

	}

	@GetMapping("/HR")
	public String HRpage() { return "/HR/index.html";

	}
	@GetMapping("/Fleet")
	public String Fleetpage() { return "/Fleet/index.html";
    }
	@GetMapping("/Helpdesk")
	public String Helpdeskpage() { return "/Helpdesk/index.html";
    }
	@GetMapping("/Parameters")
	public String Parameterspage () { return "/Parameters/index.html";
    }
	@GetMapping("/Payroll")
	public String Payrollpage() { return "/Payroll/index.html";
    }
	@GetMapping("/Finance")
	public String Financepage() { return "/Finance/index.html";
	}
	
	}