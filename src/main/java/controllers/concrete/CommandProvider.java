package controllers.concrete;

import java.util.HashMap;
import java.util.Map;

import controllers.concrete.impl.DoAuth;
import controllers.concrete.impl.DoRegistration;
import controllers.concrete.impl.GoToIndexPage;
import controllers.concrete.impl.GoToRegistrationPage;
import controllers.concrete.impl.GoToWelcomePage;

public class CommandProvider {
	private Map<CommandName, Command> commands = new HashMap<>();
	
	public CommandProvider() {
		commands.put(CommandName.DO_AUTH, new DoAuth());
		commands.put(CommandName.DO_REGISTRATION, new DoRegistration());
		
		commands.put(CommandName.GO_TO_REGISTRATION_PAGE, new GoToRegistrationPage());
		
		commands.put(CommandName.NO_SUCH_COMMAND, new NoSuchCommand());
		
		commands.put(CommandName.GO_TO_INDEX_PAGE, new GoToIndexPage());
		
		commands.put(CommandName.GO_TO_WELCOME_PAGE, new GoToWelcomePage());
	}
	
	public Command takeCommand(String userCommand) {
		CommandName commandName;
		Command command;
		
		try {
			commandName = CommandName.valueOf(userCommand.toUpperCase());
			command = commands.get(commandName);
		}catch(IllegalArgumentException | NullPointerException e) {
			command = commands.get(CommandName.NO_SUCH_COMMAND);
		}
		
		return command;
	}

}
