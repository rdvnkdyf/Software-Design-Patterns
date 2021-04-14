package main

import "fmt"

type client struct {
}

func (c *client) insertLightningConnectorIntoComputer(com computer) {
	fmt.Println("Clients insert Lightning connector into computer...")
	com.insertIntoLightningPort()
}
