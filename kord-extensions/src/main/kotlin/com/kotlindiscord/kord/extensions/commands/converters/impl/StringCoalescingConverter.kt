package com.kotlindiscord.kord.extensions.commands.converters.impl

import com.kotlindiscord.kord.extensions.ExtensibleBot
import com.kotlindiscord.kord.extensions.commands.CommandContext
import com.kotlindiscord.kord.extensions.commands.converters.CoalescingConverter
import com.kotlindiscord.kord.extensions.commands.converters.coalescedString

/**
 * Coalescing argument converter that simply joins all arguments with spaces to produce a single string.
 *
 * This converter will consume all remaining arguments.
 *
 * @see coalescedString
 */
public class StringCoalescingConverter : CoalescingConverter<String>() {
    override val signatureTypeString: String = "text"
    override val showTypeInSignature: Boolean = false

    override suspend fun parse(args: List<String>, context: CommandContext, bot: ExtensibleBot): Int {
        this.parsed = args.joinToString(" ")

        return args.size
    }
}
