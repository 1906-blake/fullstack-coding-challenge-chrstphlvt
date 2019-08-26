import React from 'react';
import { GroceryList } from '../models/groceryList';



interface IState {
    groceryList: GroceryList[],
    listName: string,
    itemId: number
}

export default class DisplayList extends React.Component<{}, Istate>{
    constructor(props: any){
        super(props);
        this.state = {
            GroceryList: [],
            itemId: 0
        }
    }

    findByNumID = async () => {
        const resp = await fetch('http://localhost:8018/grocery_list/' + this.state.itemId, {
            credentials: 'include'
        })
        gList = await resp.json();
        this.setState({
            ...this.state,

        })
        
    }
}