package com.galaxymurdermystery.galaxybot;

import com.galaxymurdermystery.galaxybot.objects.Command;
import sx.blah.discord.api.ClientBuilder;
import sx.blah.discord.api.IDiscordClient;

import java.util.HashMap;

public class HostBot {
    private IDiscordClient client;
    private HashMap<String, Command> hostCommands = new HashMap<>();

    public HostBot(){
        ClientBuilder builder = new ClientBuilder();
    }

    public IDiscordClient getClient() {
        return client;
    }
}
