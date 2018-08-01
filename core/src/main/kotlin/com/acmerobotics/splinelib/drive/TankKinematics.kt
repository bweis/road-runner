package com.acmerobotics.splinelib.drive

import com.acmerobotics.splinelib.Pose2d

object TankKinematics {
    // TODO: warn about nonzero lateral velocity?
    fun robotToWheelVelocities(robotPoseVelocity: Pose2d, trackWidth: Double) =
            listOf(robotPoseVelocity.x - trackWidth / 2 * robotPoseVelocity.heading,
                    robotPoseVelocity.x + trackWidth / 2 * robotPoseVelocity.heading)

    // follows from linearity of the derivative
    fun robotToWheelAccelerations(robotPoseAcceleration: Pose2d, trackWidth: Double) =
            robotToWheelVelocities(robotPoseAcceleration, trackWidth)
}