package com.scaler.advancejava.tictactoe.factory;

import com.scaler.advancejava.tictactoe.models.BotDifficultyLevel;
import com.scaler.advancejava.tictactoe.strategies.botPlayingStrategies.BotPlayingStrategy;
import com.scaler.advancejava.tictactoe.strategies.botPlayingStrategies.EasyBotPlayingStrategy;
import com.scaler.advancejava.tictactoe.strategies.botPlayingStrategies.HardBotPlayingStrategy;
import com.scaler.advancejava.tictactoe.strategies.botPlayingStrategies.MediumBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel difficulty) {
        switch (difficulty) {
            case EASY: return new EasyBotPlayingStrategy();
            case MEDIUM: return new MediumBotPlayingStrategy();
            case HARD: return new HardBotPlayingStrategy();
        }
        return null;
    }
}
