package main

import (
	"fmt"
	"math/rand"
)

type Result struct {
	result int
}

func MightError() (*Result, error) {
	rv := &Result{result: 1}

	if rand.Float64() < 0.5 {
		return nil, fmt.Errorf("random error")
	}
	return rv, nil

}

func main() {
	if result, err := MightError(); err != nil {
		fmt.Println("An error happened")		
	} else {
		fmt.Printf("I got a result of %d\n", result.result)
	}

}
