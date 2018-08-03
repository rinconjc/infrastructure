package com.atlassian.performance.tools.infrastructure.jvm

import com.atlassian.performance.tools.ssh.SshConnection

class PreinstalledJDK(
    private val javaBin: String
) : JavaDevelopmentKit {
    override fun install(connection: SshConnection) {}

    override fun use(): String {
        return ""
    }

    override fun command(options: String): String {
        return "$javaBin $options"
    }
}