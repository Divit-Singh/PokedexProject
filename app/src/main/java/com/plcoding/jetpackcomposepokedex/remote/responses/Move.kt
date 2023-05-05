package com.plcoding.jetpackcomposepokedex.remote.responses

data class Move(
    val move: MoveX,
    val version_group_details: List<VersionGroupDetail>
)