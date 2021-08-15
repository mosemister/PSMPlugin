package org.mose.command;

import org.jetbrains.annotations.NotNull;
import org.mose.command.context.CommandArgumentContext;

public class CommandArgumentResult<T> {

    private final int position;
    private final T value;

    public CommandArgumentResult(int position, @NotNull T value) {
        this.position = position;
        this.value = value;
    }

    public int getPosition() {
        return this.position;
    }

    public @NotNull T getValue() {
        return this.value;
    }

    public static <T> CommandArgumentResult<T> from(CommandArgumentContext<T> argumentContext, T value) {
        return from(argumentContext, 1, value);
    }

    public static <T> CommandArgumentResult<T> from(CommandArgumentContext<T> argumentContext, int length, T value) {
        return new CommandArgumentResult<>(argumentContext.getFirstArgument() + length, value);
    }


}
