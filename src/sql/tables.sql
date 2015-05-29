CREATE TABLE `users` (
	`id` INT(11) NULL DEFAULT NULL,
	`name` VARCHAR(50) NULL DEFAULT NULL,
	`funkyNumber` VARCHAR(50) NULL DEFAULT NULL,
	`roundingMode` VARCHAR(50) NULL DEFAULT NULL
);

INSERT INTO `users` (`id`, `name`, `funkyNumber`, `roundingMode`) VALUES (1, 'Blake', '123', '1');
