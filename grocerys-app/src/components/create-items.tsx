import React from 'react';
import { Input } from 'reactstrap';
import { async } from 'q';



interface IState {
    groceryItems: {
        itemNumber: number,
        food: string,
        electronics: string,
        clothing: string,
        itemsId: number
    }

}

export class CreateItems extends React.Component<{}, IState> {
    constructor(props: any){
        super(props);
        this.state = {
            itemNumber: 0,
            food: '',
            electronics: '',
            clothing: '',
            itemsId: 1
        },
        this.handleChange = this.handleChange.bind(this)

    }

    handleChange = (e: React.ChangeEvent<HTMLInputElement>) => {
        this.setState({
            ...this.state,
            groceryItems: {
                ...this.state.groceryItems,
                //extracts the name from the field in render
                [e.target.name]: e.target.value
            }
        })
    }

    submit = async(event: any) => {
        event.preventDefault();
        const newGroceryItems = {
            ...this.state.groceryItems,

            itemsId: 0
        }
        const resp = await fetch('http://localhost:8018/grocery_items', {
            credentials: 'include',
            method: 'POST',
            body: JSON.stringify(newGroceryItems)
        })

    }

    render(){
        return(
            <Form onSubmit={this.submit}>
                
                <Label>Item Id</Label>
                <Input
                    type="number"
                    name="Item Id"
                    value={this.state.groceryItems.itemNumber}
                    onChange={this.handleChange}
                ></Input>
                <Label>Food</Label>
                <Input
                    type="text"
                    name="food"
                    value={this.state.groceryItems.food}
                    onChange={this.handleChange}
                ></Input>
                <Label>Clothing</Label>
                <Input
                    type="text"
                    name="clothing"
                    value={this.state.groceryItems.clothing}
                    onChange={this.handleChange}
                ></Input>
                <Label>Electronics</Label>
                <Input
                    type="text"
                    name="electronics"
                    value={this.state.groceryItems.electronics}
                    onChange={this.handleChange}
                ></Input>
                <Label>Items Id</Label>
                <Input
                    type="number"
                    name= "items id"
                    value={this.state.groceryItems.itemsId}
                    onChange={this.handleChange}/>
                    
                <Button className ="btn-lg btn-primary" type="submit">Create</Button>
                
            </Form>
        )
    }
}