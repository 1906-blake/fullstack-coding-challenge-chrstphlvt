import React from 'react'



interface IState {
    groceryList: GroceryList[],
    listName: string,
    itemId: number
}

export default class DisplayList extends React.Component<{}, Istate>{
    constructor(props: any){
        super(props);
        this.state = {
            GroceryList[]
        }
    }

    findByNumID = async () => {
        const resp = await fetch(('http://localhost:8018/grocery_list/' + this.state.itemId, {
            credentials: 'include'
        })
        const sitter = await resp.json();
        this.setState({
            ...this.state,
            sitters: [sitter]
        }))
    }
}