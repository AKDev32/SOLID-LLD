const ProfileViewSelector = {
    getProfileView(role) {
        switch(role) {
            case 'admin' : return <AdminView />
            case 'editor': return <EditorView />
            default: return <StandardView />
        }
    }
}

export default ProfileViewSelector;