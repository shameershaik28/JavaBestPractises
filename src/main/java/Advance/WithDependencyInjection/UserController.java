package Advance.WithDependencyInjection;

public class UserController {
    private final MessageService messageService;

    //@Autowired // 👈 Spring performs Dependency Injection here
    public UserController(MessageService messageService) {
        this.messageService = messageService;
    }

    void  processUser(){
        messageService.sendMessage("Welcome User!");
    }
}
